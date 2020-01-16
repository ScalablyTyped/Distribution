package typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod

import typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Options.Actions
import typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Options.Correspondence
import typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Options.Keywords
import typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Options.Pattern
import typings.conventionalDashCommitsDashParser.conventionalDashCommitsDashParserMod.Options.Prefixes
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * What commentChar to use. By default it is `null`, so no comments are stripped.
    * Set to `#` if you pass the contents of `.git/COMMIT_EDITMSG` directly.
    *
    * If you have configured the git commentchar via git config `core.commentchar`
    * you'll want to pass what you have set there.
    *
    * @default
    * null
    */
  var commentChar: js.UndefOr[String | Null] = js.undefined
  /**
    * Pattern to match other fields.
    *
    * @default
    * /^-(.*?)-$/
    */
  var fieldPattern: js.UndefOr[Pattern] = js.undefined
  /**
    * Used to define what capturing group of `headerPattern` captures what header
    * part. The order of the array should correspond to the order of
    * `headerPattern`'s capturing group. If the part is not captured it is `null`.
    * If it's a `string` it will be converted to an `array` separated by a comma.
    *
    * @default
    * ['type', 'scope', 'subject']
    */
  var headerCorrespondence: js.UndefOr[Correspondence] = js.undefined
  /**
    * Used to match header pattern.
    *
    * @default
    * /^(\w*)(?:\(([\w\$\.\-\* ]*)\))?\: (.*)$/
    */
  var headerPattern: js.UndefOr[Pattern] = js.undefined
  /**
    * The prefixes of an issue. EG: In `gh-123` `gh-` is the prefix.
    *
    * @default
    * ['#']
    */
  var issuePrefixes: js.UndefOr[Prefixes] = js.undefined
  /**
    * Used to define if `issuePrefixes` should be considered case sensitive.
    *
    * @default
    * false
    */
  var issuePrefixesCaseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to define what capturing group of `mergePattern`.
    *
    * If it's a `string` it will be converted to an `array` separated by a comma.
    *
    * @default
    * null
    */
  var mergeCorrespondence: js.UndefOr[Correspondence] = js.undefined
  /**
    * Pattern to match merge headers. EG: branch merge, GitHub or GitLab like pull
    * requests headers. When a merge header is parsed, the next line is used for
    * conventional header parsing.
    *
    * For example, if we have a commit
    *
    * ```text
    * Merge pull request #1 from user/feature/feature-name
    *
    * feat(scope): broadcast $destroy event on scope destruction
    * ```
    *
    * We can parse it with these options and the default headerPattern:
    *
    * ```javascript
    * {
    *  mergePattern: /^Merge pull request #(\d+) from (.*)$/,
    *  mergeCorrespondence: ['id', 'source']
    * }
    * ```
    *
    * @default
    * null
    */
  var mergePattern: js.UndefOr[Pattern] = js.undefined
  /**
    * Keywords for important notes. This value is case __insensitive__. If it's a
    * `string` it will be converted to an `array` separated by a comma.
    *
    * @default
    * ['BREAKING CHANGE']
    */
  var noteKeywords: js.UndefOr[Keywords] = js.undefined
  /**
    * Keywords to reference an issue. This value is case __insensitive__. If it's a
    * `string` it will be converted to an `array` separated by a comma.
    *
    * Set it to `null` to reference an issue without any action.
    *
    * @default
    * ['close', 'closes', 'closed', 'fix', 'fixes', 'fixed', 'resolve', 'resolves', 'resolved']
    */
  var referenceActions: js.UndefOr[Actions] = js.undefined
  /**
    * Used to define what capturing group of `revertPattern` captures what reverted
    * commit fields. The order of the array should correspond to the order of
    * `revertPattern`'s capturing group.
    *
    * For example, if we had commit
    *
    * ```
    * Revert "throw an error if a callback is passed"
    *
    * This reverts commit 9bb4d6c.
    * ```
    *
    * If configured correctly, the parsed result would be
    *
    * ```
    * {
    *  revert: {
    *    header: 'throw an error if a callback is passed',
    *    hash: '9bb4d6c'
    *  }
    * }
    * ```
    *
    * It implies that this commit reverts a commit with header `'throw an error if
    * a callback is passed'` and hash `'9bb4d6c'`.
    *
    * If it's a `string` it will be converted to an `array` separated by a comma.
    *
    * @default
    * ['header', 'hash']
    */
  var revertCorrespondence: js.UndefOr[Correspondence] = js.undefined
  /**
    * Pattern to match what this commit reverts.
    *
    * @default
    * /^Revert\s"([\s\S]*)"\s*This reverts commit (\w*)\./
    */
  var revertPattern: js.UndefOr[Pattern] = js.undefined
  /**
    * What warn function to use. For example, `console.warn.bind(console)` or
    * `grunt.log.writeln`. By default, it's a noop. If it is `true`, it will error
    * if commit cannot be parsed (strict).
    *
    * @default
    * function () {}
    */
  var warn: js.UndefOr[js.Function1[/* message */ js.UndefOr[js.Any], Unit | Boolean]] = js.undefined
}

@JSImport("conventional-commits-parser", "Options")
@js.native
object Options extends js.Object {
  type Actions = js.Array[String] | String | Null
  type Correspondence = js.Array[String] | String | Null
  type Keywords = js.Array[String] | String | Null
  type Pattern = RegExp | String | Null
  type Prefixes = js.Array[String] | String | Null
}

