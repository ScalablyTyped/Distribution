package typings.conventionalCommitsParser

import org.scalablytyped.runtime.StringDictionary
import typings.conventionalCommitsParser.mod.Commit.Field
import typings.conventionalCommitsParser.mod.Commit.Note
import typings.conventionalCommitsParser.mod.Commit.Reference
import typings.conventionalCommitsParser.mod.Commit.Revert
import typings.conventionalCommitsParser.mod.Options.Actions
import typings.conventionalCommitsParser.mod.Options.Correspondence
import typings.conventionalCommitsParser.mod.Options.Keywords
import typings.conventionalCommitsParser.mod.Options.Pattern
import typings.conventionalCommitsParser.mod.Options.Prefixes
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns an transform stream. If there is any malformed commits it will be
    * gracefully ignored (an empty data will be emitted so down stream can notice).
    *
    * @param options
    */
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(options: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("conventional-commits-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The sync version. Useful when parsing a single commit. Returns the result.
    *
    * @param commit  A single commit to be parsed.
    * @param options Same as the `options` of `conventionalCommitsParser`.
    */
  inline def sync(commit: String): Commit[String | Double | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(commit.asInstanceOf[js.Any]).asInstanceOf[Commit[String | Double | js.Symbol]]
  inline def sync(commit: String, options: Options): Commit[String | Double | js.Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(commit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Commit[String | Double | js.Symbol]]
  
  object Commit {
    
    type Field = String | Null
    
    trait Note extends StObject {
      
      var text: String
      
      var title: String
    }
    object Note {
      
      inline def apply(text: String, title: String): Note = {
        val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Note]
      }
      
      extension [Self <: Note](x: Self) {
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    trait Reference extends StObject {
      
      /**
        * @default
        * null
        */
      var action: Field
      
      var issue: String
      
      /**
        * @default
        * null
        */
      var owner: Field
      
      var prefix: String
      
      var raw: String
      
      /**
        * @default
        * null
        */
      var repository: Field
    }
    object Reference {
      
      inline def apply(issue: String, prefix: String, raw: String): Reference = {
        val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], action = null, owner = null, repository = null)
        __obj.asInstanceOf[Reference]
      }
      
      extension [Self <: Reference](x: Self) {
        
        inline def setAction(value: Field): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionNull: Self = StObject.set(x, "action", null)
        
        inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
        
        inline def setOwner(value: Field): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
        
        inline def setOwnerNull: Self = StObject.set(x, "owner", null)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        inline def setRepository(value: Field): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
        
        inline def setRepositoryNull: Self = StObject.set(x, "repository", null)
      }
    }
    
    trait Revert
      extends StObject
         with /* field */ StringDictionary[js.UndefOr[Field]] {
      
      var hash: js.UndefOr[Field] = js.undefined
      
      var header: js.UndefOr[Field] = js.undefined
    }
    object Revert {
      
      inline def apply(): Revert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Revert]
      }
      
      extension [Self <: Revert](x: Self) {
        
        inline def setHash(value: Field): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
        
        inline def setHashNull: Self = StObject.set(x, "hash", null)
        
        inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
        
        inline def setHeader(value: Field): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        inline def setHeaderNull: Self = StObject.set(x, "header", null)
        
        inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      }
    }
  }
  type Commit[Fields /* <: String | Double | js.Symbol */] = CommitBase & (/* import warning: importer.ImportType#apply Failed type conversion: {[ Field in std.Exclude<Fields, 'merge' | 'header' | 'body' | 'footer' | 'notes' | 'references' | 'mentions' | 'revert' | 'type' | 'scope' | 'subject'> ]:? conventional-commits-parser.conventional-commits-parser.Commit.Field} */ js.Any)
  
  trait CommitBase extends StObject {
    
    /**
      * @default
      * null
      */
    var body: Field
    
    /**
      * @default
      * null
      */
    var footer: Field
    
    /**
      * @default
      * null
      */
    var header: Field
    
    /**
      * @default
      * []
      */
    var mentions: js.Array[String]
    
    /**
      * @default
      * null
      */
    var merge: Field
    
    /**
      * @default
      * []
      */
    var notes: js.Array[Note]
    
    /**
      * @default
      * []
      */
    var references: js.Array[Reference]
    
    /**
      * @default
      * null
      */
    var revert: Revert | Null
    
    var scope: js.UndefOr[Field] = js.undefined
    
    var subject: js.UndefOr[Field] = js.undefined
    
    var `type`: js.UndefOr[Field] = js.undefined
  }
  object CommitBase {
    
    inline def apply(mentions: js.Array[String], notes: js.Array[Note], references: js.Array[Reference]): CommitBase = {
      val __obj = js.Dynamic.literal(mentions = mentions.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], body = null, footer = null, header = null, merge = null, revert = null)
      __obj.asInstanceOf[CommitBase]
    }
    
    extension [Self <: CommitBase](x: Self) {
      
      inline def setBody(value: Field): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setFooter(value: Field): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setHeader(value: Field): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setMentions(value: js.Array[String]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
      
      inline def setMentionsVarargs(value: String*): Self = StObject.set(x, "mentions", js.Array(value*))
      
      inline def setMerge(value: Field): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeNull: Self = StObject.set(x, "merge", null)
      
      inline def setNotes(value: js.Array[Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesVarargs(value: Note*): Self = StObject.set(x, "notes", js.Array(value*))
      
      inline def setReferences(value: js.Array[Reference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesVarargs(value: Reference*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setRevert(value: Revert): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      inline def setRevertNull: Self = StObject.set(x, "revert", null)
      
      inline def setScope(value: Field): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeNull: Self = StObject.set(x, "scope", null)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSubject(value: Field): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectNull: Self = StObject.set(x, "subject", null)
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setType(value: Field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
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
    var warn: js.UndefOr[(js.Function1[/* message */ js.UndefOr[Any], Unit]) | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    type Actions = js.Array[String] | String | Null
    
    type Correspondence = js.Array[String] | String | Null
    
    type Keywords = js.Array[String] | String | Null
    
    extension [Self <: Options](x: Self) {
      
      inline def setCommentChar(value: String): Self = StObject.set(x, "commentChar", value.asInstanceOf[js.Any])
      
      inline def setCommentCharNull: Self = StObject.set(x, "commentChar", null)
      
      inline def setCommentCharUndefined: Self = StObject.set(x, "commentChar", js.undefined)
      
      inline def setFieldPattern(value: Pattern): Self = StObject.set(x, "fieldPattern", value.asInstanceOf[js.Any])
      
      inline def setFieldPatternNull: Self = StObject.set(x, "fieldPattern", null)
      
      inline def setFieldPatternUndefined: Self = StObject.set(x, "fieldPattern", js.undefined)
      
      inline def setHeaderCorrespondence(value: Correspondence): Self = StObject.set(x, "headerCorrespondence", value.asInstanceOf[js.Any])
      
      inline def setHeaderCorrespondenceNull: Self = StObject.set(x, "headerCorrespondence", null)
      
      inline def setHeaderCorrespondenceUndefined: Self = StObject.set(x, "headerCorrespondence", js.undefined)
      
      inline def setHeaderCorrespondenceVarargs(value: String*): Self = StObject.set(x, "headerCorrespondence", js.Array(value*))
      
      inline def setHeaderPattern(value: Pattern): Self = StObject.set(x, "headerPattern", value.asInstanceOf[js.Any])
      
      inline def setHeaderPatternNull: Self = StObject.set(x, "headerPattern", null)
      
      inline def setHeaderPatternUndefined: Self = StObject.set(x, "headerPattern", js.undefined)
      
      inline def setIssuePrefixes(value: Prefixes): Self = StObject.set(x, "issuePrefixes", value.asInstanceOf[js.Any])
      
      inline def setIssuePrefixesCaseSensitive(value: Boolean): Self = StObject.set(x, "issuePrefixesCaseSensitive", value.asInstanceOf[js.Any])
      
      inline def setIssuePrefixesCaseSensitiveUndefined: Self = StObject.set(x, "issuePrefixesCaseSensitive", js.undefined)
      
      inline def setIssuePrefixesNull: Self = StObject.set(x, "issuePrefixes", null)
      
      inline def setIssuePrefixesUndefined: Self = StObject.set(x, "issuePrefixes", js.undefined)
      
      inline def setIssuePrefixesVarargs(value: String*): Self = StObject.set(x, "issuePrefixes", js.Array(value*))
      
      inline def setMergeCorrespondence(value: Correspondence): Self = StObject.set(x, "mergeCorrespondence", value.asInstanceOf[js.Any])
      
      inline def setMergeCorrespondenceNull: Self = StObject.set(x, "mergeCorrespondence", null)
      
      inline def setMergeCorrespondenceUndefined: Self = StObject.set(x, "mergeCorrespondence", js.undefined)
      
      inline def setMergeCorrespondenceVarargs(value: String*): Self = StObject.set(x, "mergeCorrespondence", js.Array(value*))
      
      inline def setMergePattern(value: Pattern): Self = StObject.set(x, "mergePattern", value.asInstanceOf[js.Any])
      
      inline def setMergePatternNull: Self = StObject.set(x, "mergePattern", null)
      
      inline def setMergePatternUndefined: Self = StObject.set(x, "mergePattern", js.undefined)
      
      inline def setNoteKeywords(value: Keywords): Self = StObject.set(x, "noteKeywords", value.asInstanceOf[js.Any])
      
      inline def setNoteKeywordsNull: Self = StObject.set(x, "noteKeywords", null)
      
      inline def setNoteKeywordsUndefined: Self = StObject.set(x, "noteKeywords", js.undefined)
      
      inline def setNoteKeywordsVarargs(value: String*): Self = StObject.set(x, "noteKeywords", js.Array(value*))
      
      inline def setReferenceActions(value: Actions): Self = StObject.set(x, "referenceActions", value.asInstanceOf[js.Any])
      
      inline def setReferenceActionsNull: Self = StObject.set(x, "referenceActions", null)
      
      inline def setReferenceActionsUndefined: Self = StObject.set(x, "referenceActions", js.undefined)
      
      inline def setReferenceActionsVarargs(value: String*): Self = StObject.set(x, "referenceActions", js.Array(value*))
      
      inline def setRevertCorrespondence(value: Correspondence): Self = StObject.set(x, "revertCorrespondence", value.asInstanceOf[js.Any])
      
      inline def setRevertCorrespondenceNull: Self = StObject.set(x, "revertCorrespondence", null)
      
      inline def setRevertCorrespondenceUndefined: Self = StObject.set(x, "revertCorrespondence", js.undefined)
      
      inline def setRevertCorrespondenceVarargs(value: String*): Self = StObject.set(x, "revertCorrespondence", js.Array(value*))
      
      inline def setRevertPattern(value: Pattern): Self = StObject.set(x, "revertPattern", value.asInstanceOf[js.Any])
      
      inline def setRevertPatternNull: Self = StObject.set(x, "revertPattern", null)
      
      inline def setRevertPatternUndefined: Self = StObject.set(x, "revertPattern", js.undefined)
      
      inline def setWarn(value: (js.Function1[/* message */ js.UndefOr[Any], Unit]) | Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnFunction1(value: /* message */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
    
    type Pattern = js.RegExp | String | Null
    
    type Prefixes = js.Array[String] | String | Null
  }
}
