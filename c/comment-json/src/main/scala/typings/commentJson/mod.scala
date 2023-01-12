package typings.commentJson

import org.scalablytyped.runtime.StringDictionary
import typings.commentJson.commentJsonStrings.BlockComment
import typings.commentJson.commentJsonStrings.LineComment
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("comment-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("comment-json", "CommentArray")
  @js.native
  open class CommentArray[TValue] ()
    extends StObject
       with Array[TValue]
  
  inline def assign[TTarget, TSource](target: TTarget, source: TSource): TTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[TTarget]
  inline def assign[TTarget, TSource](
    target: TTarget,
    source: TSource,
    // Although it actually accepts more key types and filters then`,
  // we set the type of `keys` stricter
  keys: js.Array[Double | String]
  ): TTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[TTarget]
  
  inline def parse(json: String): CommentJSONValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any]).asInstanceOf[CommentJSONValue]
  inline def parse(json: String, reviver: Unit, removesComments: Boolean): CommentJSONValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], removesComments.asInstanceOf[js.Any])).asInstanceOf[CommentJSONValue]
  inline def parse(json: String, reviver: Reviver): CommentJSONValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[CommentJSONValue]
  inline def parse(json: String, reviver: Reviver, removesComments: Boolean): CommentJSONValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], removesComments.asInstanceOf[js.Any])).asInstanceOf[CommentJSONValue]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[Double | String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[Double | String], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[Double | String], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tokenize(input: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  inline def tokenize(input: String, config: TokenizeOptions): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  
  /* Rewritten from type alias, can be one of: 
    - / * template literal string: ${CommentPrefix}:${string} * / java.lang.String
    - typings.commentJson.commentJsonStrings.before
    - typings.commentJson.commentJsonStrings.`before-all`
    - typings.commentJson.commentJsonStrings.`after-all`
  */
  type CommentDescriptor = _CommentDescriptor | (/* template literal string: ${CommentPrefix}:${string} */ String)
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type CommentJSONValue = number | string | null | boolean | comment-json.comment-json.CommentArray<comment-json.comment-json.CommentJSONValue> | comment-json.comment-json.CommentObject
  }}}
  to avoid circular code involving: 
  - comment-json.comment-json.CommentJSONValue
  */
  type CommentJSONValue = Double | String | Null | Boolean | CommentArray[Any] | CommentObject
  
  trait CommentLocation extends StObject {
    
    // The end location of multi-line comment ends at the `*/` symbol
    var end: Location
    
    // The start location begins at the `//` or `/*` symbol
    var start: Location
  }
  object CommentLocation {
    
    inline def apply(end: Location, start: Location): CommentLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommentLocation] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommentObject
    extends StObject
       with /* key */ StringDictionary[CommentJSONValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.commentJson.commentJsonStrings.before
    - typings.commentJson.commentJsonStrings.`after-prop`
    - typings.commentJson.commentJsonStrings.`after-colon`
    - typings.commentJson.commentJsonStrings.`after-value`
    - typings.commentJson.commentJsonStrings.after
  */
  trait CommentPrefix extends StObject
  object CommentPrefix {
    
    inline def after: typings.commentJson.commentJsonStrings.after = "after".asInstanceOf[typings.commentJson.commentJsonStrings.after]
    
    inline def `after-colon`: typings.commentJson.commentJsonStrings.`after-colon` = "after-colon".asInstanceOf[typings.commentJson.commentJsonStrings.`after-colon`]
    
    inline def `after-prop`: typings.commentJson.commentJsonStrings.`after-prop` = "after-prop".asInstanceOf[typings.commentJson.commentJsonStrings.`after-prop`]
    
    inline def `after-value`: typings.commentJson.commentJsonStrings.`after-value` = "after-value".asInstanceOf[typings.commentJson.commentJsonStrings.`after-value`]
    
    inline def before: typings.commentJson.commentJsonStrings.before = "before".asInstanceOf[typings.commentJson.commentJsonStrings.before]
  }
  
  type CommentSymbol = js.Symbol
  
  trait CommentToken extends StObject {
    
    // If the start location is the same line as the previous token,
    // then `inline` is `true`
    var `inline`: Boolean
    
    // But pay attention that,
    // locations will NOT be maintained when stringified
    var loc: CommentLocation
    
    var `type`: BlockComment | LineComment
    
    // The content of the comment, including whitespaces and line breaks
    var value: String
  }
  object CommentToken {
    
    inline def apply(`inline`: Boolean, loc: CommentLocation, `type`: BlockComment | LineComment, value: String): CommentToken = {
      val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommentToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommentToken] (val x: Self) extends AnyVal {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setLoc(value: CommentLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setType(value: BlockComment | LineComment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Location {
    
    inline def apply(column: Double, line: Double): Location = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  type Reviver = js.Function2[/* k */ Double | String, /* v */ Any, Any]
  
  trait Token extends StObject {
    
    var `type`: String
    
    var value: String
  }
  object Token {
    
    inline def apply(`type`: String, value: String): Token = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenizeOptions extends StObject {
    
    var comment: js.UndefOr[Boolean] = js.undefined
    
    var loc: js.UndefOr[Boolean] = js.undefined
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var tolerant: js.UndefOr[Boolean] = js.undefined
  }
  object TokenizeOptions {
    
    inline def apply(): TokenizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizeOptions] (val x: Self) extends AnyVal {
      
      inline def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setLoc(value: Boolean): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      inline def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
    }
  }
  
  trait _CommentDescriptor extends StObject
}
