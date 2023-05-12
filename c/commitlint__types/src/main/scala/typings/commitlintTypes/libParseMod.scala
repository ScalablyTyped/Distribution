package typings.commitlintTypes

import typings.commitlintTypes.anon.OmitCommitraw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParseMod {
  
  trait Commit extends StObject {
    
    var body: String | Null
    
    var footer: String | Null
    
    var header: String
    
    var mentions: js.Array[String]
    
    var merge: Any
    
    var notes: js.Array[CommitNote]
    
    var raw: String
    
    var references: js.Array[CommitReference]
    
    var revert: Any
    
    var scope: String | Null
    
    var subject: String | Null
    
    var `type`: String | Null
  }
  object Commit {
    
    inline def apply(
      header: String,
      mentions: js.Array[String],
      merge: Any,
      notes: js.Array[CommitNote],
      raw: String,
      references: js.Array[CommitReference],
      revert: Any
    ): Commit = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], mentions = mentions.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], body = null, footer = null, scope = null, subject = null)
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[Commit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setMentions(value: js.Array[String]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
      
      inline def setMentionsVarargs(value: String*): Self = StObject.set(x, "mentions", js.Array(value*))
      
      inline def setMerge(value: Any): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setNotes(value: js.Array[CommitNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesVarargs(value: CommitNote*): Self = StObject.set(x, "notes", js.Array(value*))
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setReferences(value: js.Array[CommitReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesVarargs(value: CommitReference*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setRevert(value: Any): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeNull: Self = StObject.set(x, "scope", null)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectNull: Self = StObject.set(x, "subject", null)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  trait CommitNote extends StObject {
    
    var text: String
    
    var title: String
  }
  object CommitNote {
    
    inline def apply(text: String, title: String): CommitNote = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitNote]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommitNote] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommitReference extends StObject {
    
    var action: String | Null
    
    var issue: String | Null
    
    var owner: String | Null
    
    var prefix: String
    
    var raw: String
    
    var repository: String | Null
  }
  object CommitReference {
    
    inline def apply(prefix: String, raw: String): CommitReference = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], action = null, issue = null, owner = null, repository = null)
      __obj.asInstanceOf[CommitReference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommitReference] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionNull: Self = StObject.set(x, "action", null)
      
      inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
      
      inline def setIssueNull: Self = StObject.set(x, "issue", null)
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerNull: Self = StObject.set(x, "owner", null)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryNull: Self = StObject.set(x, "repository", null)
    }
  }
  
  type Parser = js.Function2[/* message */ String, /* options */ ParserOptions, OmitCommitraw]
  
  trait ParserOptions extends StObject {
    
    var commentChar: js.UndefOr[String] = js.undefined
    
    var fieldPattern: js.UndefOr[js.RegExp] = js.undefined
    
    var headerCorrespondence: js.UndefOr[js.Array[String]] = js.undefined
    
    var headerPattern: js.UndefOr[js.RegExp] = js.undefined
    
    var issuePrefixes: js.UndefOr[js.Array[String]] = js.undefined
    
    var mergeCorrespondence: js.UndefOr[js.Array[String]] = js.undefined
    
    var mergePattern: js.UndefOr[js.RegExp] = js.undefined
    
    var noteKeywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var revertCorrespondence: js.UndefOr[js.Array[String]] = js.undefined
    
    var revertPattern: js.UndefOr[js.RegExp] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      inline def setCommentChar(value: String): Self = StObject.set(x, "commentChar", value.asInstanceOf[js.Any])
      
      inline def setCommentCharUndefined: Self = StObject.set(x, "commentChar", js.undefined)
      
      inline def setFieldPattern(value: js.RegExp): Self = StObject.set(x, "fieldPattern", value.asInstanceOf[js.Any])
      
      inline def setFieldPatternUndefined: Self = StObject.set(x, "fieldPattern", js.undefined)
      
      inline def setHeaderCorrespondence(value: js.Array[String]): Self = StObject.set(x, "headerCorrespondence", value.asInstanceOf[js.Any])
      
      inline def setHeaderCorrespondenceUndefined: Self = StObject.set(x, "headerCorrespondence", js.undefined)
      
      inline def setHeaderCorrespondenceVarargs(value: String*): Self = StObject.set(x, "headerCorrespondence", js.Array(value*))
      
      inline def setHeaderPattern(value: js.RegExp): Self = StObject.set(x, "headerPattern", value.asInstanceOf[js.Any])
      
      inline def setHeaderPatternUndefined: Self = StObject.set(x, "headerPattern", js.undefined)
      
      inline def setIssuePrefixes(value: js.Array[String]): Self = StObject.set(x, "issuePrefixes", value.asInstanceOf[js.Any])
      
      inline def setIssuePrefixesUndefined: Self = StObject.set(x, "issuePrefixes", js.undefined)
      
      inline def setIssuePrefixesVarargs(value: String*): Self = StObject.set(x, "issuePrefixes", js.Array(value*))
      
      inline def setMergeCorrespondence(value: js.Array[String]): Self = StObject.set(x, "mergeCorrespondence", value.asInstanceOf[js.Any])
      
      inline def setMergeCorrespondenceUndefined: Self = StObject.set(x, "mergeCorrespondence", js.undefined)
      
      inline def setMergeCorrespondenceVarargs(value: String*): Self = StObject.set(x, "mergeCorrespondence", js.Array(value*))
      
      inline def setMergePattern(value: js.RegExp): Self = StObject.set(x, "mergePattern", value.asInstanceOf[js.Any])
      
      inline def setMergePatternUndefined: Self = StObject.set(x, "mergePattern", js.undefined)
      
      inline def setNoteKeywords(value: js.Array[String]): Self = StObject.set(x, "noteKeywords", value.asInstanceOf[js.Any])
      
      inline def setNoteKeywordsUndefined: Self = StObject.set(x, "noteKeywords", js.undefined)
      
      inline def setNoteKeywordsVarargs(value: String*): Self = StObject.set(x, "noteKeywords", js.Array(value*))
      
      inline def setRevertCorrespondence(value: js.Array[String]): Self = StObject.set(x, "revertCorrespondence", value.asInstanceOf[js.Any])
      
      inline def setRevertCorrespondenceUndefined: Self = StObject.set(x, "revertCorrespondence", js.undefined)
      
      inline def setRevertCorrespondenceVarargs(value: String*): Self = StObject.set(x, "revertCorrespondence", js.Array(value*))
      
      inline def setRevertPattern(value: js.RegExp): Self = StObject.set(x, "revertPattern", value.asInstanceOf[js.Any])
      
      inline def setRevertPatternUndefined: Self = StObject.set(x, "revertPattern", js.undefined)
    }
  }
}
