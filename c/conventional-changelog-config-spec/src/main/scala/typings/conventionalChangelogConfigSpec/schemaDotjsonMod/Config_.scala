package typings.conventionalChangelogConfigSpec.schemaDotjsonMod

import typings.conventionalChangelogConfigSpec.schemaDotjsonMod.Config.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the configuration options supported by conventional-config for
  * upstream tooling.
  */
trait Config_ extends js.Object {
  /**
    * A URL representing a specific commit at a hash.
    *
    * @default
    * "{{host}}/{{owner}}/{{repository}}/commit/{{hash}}"
    */
  var commitUrlFormat: js.UndefOr[String] = js.undefined
  /**
    * A URL representing the comparison between two git SHAs.
    *
    * @default
    * "{{host}}/{{owner}}/{{repository}}/compare/{{previousTag}}...{{currentTag}}"
    */
  var compareUrlFormat: js.UndefOr[String] = js.undefined
  /**
    * A string to be used as the main header section of the CHANGELOG.
    *
    * @default
    * "# Changelog\n\n"
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    * A URL representing the issue format (allowing a different URL format to be
    * swapped in for Gitlab, Bitbucket, etc).
    *
    * @default
    * "{{host}}/{{owner}}/{{repository}}/issues/{{id}}"
    */
  var issueUrlFormat: js.UndefOr[String] = js.undefined
  /**
    * Boolean indicating whether or not the action being run (generating CHANGELOG,
    * recommendedBump, etc.) is being performed for a pre-major release (<1.0.0).
    *
    * This config setting will generally be set by tooling and not a user.
    *
    * @default
    * false
    */
  var preMajor: js.UndefOr[Boolean] = js.undefined
  /**
    * A string to be used to format the auto-generated release commit message.
    *
    * @default
    * "chore(release): {{currentTag}}"
    */
  var releaseCommitMessageFormat: js.UndefOr[String] = js.undefined
  /**
    * An array of `type` objects representing the explicitly supported commit
    * message types, and whether they should show up in generated `CHANGELOG`s.
    *
    * @default
    * [
    *     { "type": "feat", "section": "Features" },
    *     { "type": "fix", "section": "Bug Fixes" },
    *     { "type": "chore", "hidden": true },
    *     { "type": "docs", "hidden": true },
    *     { "type": "style", "hidden": true },
    *     { "type": "refactor", "hidden": true },
    *     { "type": "perf", "hidden": true },
    *     { "type": "test", "hidden": true }
    * ]
    */
  var types: js.UndefOr[js.Array[Type]] = js.undefined
  /**
    * A URL representing the a user's profile URL on GitHub, Gitlab, etc. This URL
    * is used for substituting @bcoe with https://github.com/bcoe in commit
    * messages.
    *
    * @default
    * "{{host}}/{{user}}"
    */
  var userUrlFormat: js.UndefOr[String] = js.undefined
}

object Config_ {
  @scala.inline
  def apply(
    commitUrlFormat: String = null,
    compareUrlFormat: String = null,
    header: String = null,
    issueUrlFormat: String = null,
    preMajor: js.UndefOr[Boolean] = js.undefined,
    releaseCommitMessageFormat: String = null,
    types: js.Array[Type] = null,
    userUrlFormat: String = null
  ): Config_ = {
    val __obj = js.Dynamic.literal()
    if (commitUrlFormat != null) __obj.updateDynamic("commitUrlFormat")(commitUrlFormat.asInstanceOf[js.Any])
    if (compareUrlFormat != null) __obj.updateDynamic("compareUrlFormat")(compareUrlFormat.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (issueUrlFormat != null) __obj.updateDynamic("issueUrlFormat")(issueUrlFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(preMajor)) __obj.updateDynamic("preMajor")(preMajor.asInstanceOf[js.Any])
    if (releaseCommitMessageFormat != null) __obj.updateDynamic("releaseCommitMessageFormat")(releaseCommitMessageFormat.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (userUrlFormat != null) __obj.updateDynamic("userUrlFormat")(userUrlFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
}

