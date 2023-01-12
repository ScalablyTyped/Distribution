package typings.babelParser

import typings.babelParser.babelParserStrings.File
import typings.babelParser.babelParserStrings.`may-2020`
import typings.babelParser.mod.ParseError
import typings.babelTypes.mod.Comment
import typings.babelTypes.mod.CommentBlock
import typings.babelTypes.mod.CommentLine
import typings.babelTypes.mod.Program_
import typings.babelTypes.mod.SourceLocation
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassFeatures extends StObject {
    
    var classFeatures: js.UndefOr[Boolean] = js.undefined
  }
  object ClassFeatures {
    
    inline def apply(): ClassFeatures = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassFeatures]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassFeatures] (val x: Self) extends AnyVal {
      
      inline def setClassFeatures(value: Boolean): Self = StObject.set(x, "classFeatures", value.asInstanceOf[js.Any])
      
      inline def setClassFeaturesUndefined: Self = StObject.set(x, "classFeatures", js.undefined)
    }
  }
  
  trait Errors extends StObject {
    
    var errors: js.Array[ParseError]
  }
  object Errors {
    
    inline def apply(errors: js.Array[ParseError]): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
  
  trait ErrorsArray extends StObject {
    
    var errors: js.Array[typings.babelParser.typingsBabelParserDotsourceMod.ParseError]
  }
  object ErrorsArray {
    
    inline def apply(errors: js.Array[typings.babelParser.typingsBabelParserDotsourceMod.ParseError]): ErrorsArray = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorsArray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorsArray] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[typings.babelParser.typingsBabelParserDotsourceMod.ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: typings.babelParser.typingsBabelParserDotsourceMod.ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
  
  /* Inlined @babel/parser.@babel/parser.ParseResult<@babel/types.@babel/types.File> */
  trait ParseResultFile extends StObject {
    
    var comments: (js.Array[CommentBlock | CommentLine]) | Null
    
    var end: Double | Null
    
    var errors: js.Array[ParseError]
    
    var extra: js.UndefOr[Record[String, Any]] = js.undefined
    
    var innerComments: js.Array[Comment] | Null
    
    var leadingComments: js.Array[Comment] | Null
    
    var loc: SourceLocation | Null
    
    var program: Program_
    
    var start: Double | Null
    
    var tokens: js.Array[Any] | Null
    
    var trailingComments: js.Array[Comment] | Null
    
    var `type`: File
  }
  object ParseResultFile {
    
    inline def apply(errors: js.Array[ParseError], program: Program_): ParseResultFile = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], comments = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, tokens = null, trailingComments = null)
      __obj.updateDynamic("type")("File")
      __obj.asInstanceOf[ParseResultFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseResultFile] (val x: Self) extends AnyVal {
      
      inline def setComments(value: js.Array[CommentBlock | CommentLine]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsNull: Self = StObject.set(x, "comments", null)
      
      inline def setCommentsVarargs(value: (CommentBlock | CommentLine)*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setExtra(value: Record[String, Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setInnerComments(value: js.Array[Comment]): Self = StObject.set(x, "innerComments", value.asInstanceOf[js.Any])
      
      inline def setInnerCommentsNull: Self = StObject.set(x, "innerComments", null)
      
      inline def setInnerCommentsVarargs(value: Comment*): Self = StObject.set(x, "innerComments", js.Array(value*))
      
      inline def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
      
      inline def setLeadingCommentsNull: Self = StObject.set(x, "leadingComments", null)
      
      inline def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value*))
      
      inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocNull: Self = StObject.set(x, "loc", null)
      
      inline def setProgram(value: Program_): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setTokens(value: js.Array[Any]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensNull: Self = StObject.set(x, "tokens", null)
      
      inline def setTokensVarargs(value: Any*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
      
      inline def setTrailingCommentsNull: Self = StObject.set(x, "trailingComments", null)
      
      inline def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value*))
      
      inline def setType(value: File): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @babel/parser.@babel/parser/typings/babel-parser.source.ParseResult<@babel/types.@babel/types.File> */
  trait ParseResultFileComments extends StObject {
    
    var comments: (js.Array[CommentBlock | CommentLine]) | Null
    
    var end: Double | Null
    
    var errors: js.Array[typings.babelParser.typingsBabelParserDotsourceMod.ParseError]
    
    var extra: js.UndefOr[Record[String, Any]] = js.undefined
    
    var innerComments: js.Array[Comment] | Null
    
    var leadingComments: js.Array[Comment] | Null
    
    var loc: SourceLocation | Null
    
    var program: Program_
    
    var start: Double | Null
    
    var tokens: js.Array[Any] | Null
    
    var trailingComments: js.Array[Comment] | Null
    
    var `type`: File
  }
  object ParseResultFileComments {
    
    inline def apply(errors: js.Array[typings.babelParser.typingsBabelParserDotsourceMod.ParseError], program: Program_): ParseResultFileComments = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], comments = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, tokens = null, trailingComments = null)
      __obj.updateDynamic("type")("File")
      __obj.asInstanceOf[ParseResultFileComments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseResultFileComments] (val x: Self) extends AnyVal {
      
      inline def setComments(value: js.Array[CommentBlock | CommentLine]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsNull: Self = StObject.set(x, "comments", null)
      
      inline def setCommentsVarargs(value: (CommentBlock | CommentLine)*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setErrors(value: js.Array[typings.babelParser.typingsBabelParserDotsourceMod.ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: typings.babelParser.typingsBabelParserDotsourceMod.ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setExtra(value: Record[String, Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setInnerComments(value: js.Array[Comment]): Self = StObject.set(x, "innerComments", value.asInstanceOf[js.Any])
      
      inline def setInnerCommentsNull: Self = StObject.set(x, "innerComments", null)
      
      inline def setInnerCommentsVarargs(value: Comment*): Self = StObject.set(x, "innerComments", js.Array(value*))
      
      inline def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
      
      inline def setLeadingCommentsNull: Self = StObject.set(x, "leadingComments", null)
      
      inline def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value*))
      
      inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocNull: Self = StObject.set(x, "loc", null)
      
      inline def setProgram(value: Program_): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setTokens(value: js.Array[Any]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensNull: Self = StObject.set(x, "tokens", null)
      
      inline def setTokensVarargs(value: Any*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
      
      inline def setTrailingCommentsNull: Self = StObject.set(x, "trailingComments", null)
      
      inline def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value*))
      
      inline def setType(value: File): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Version extends StObject {
    
    var version: `may-2020`
  }
  object Version {
    
    inline def apply(): Version = {
      val __obj = js.Dynamic.literal(version = "may-2020")
      __obj.asInstanceOf[Version]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
      
      inline def setVersion(value: `may-2020`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
