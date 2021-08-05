package typings.commentJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("comment-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: js.Any, source: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def assign(target: js.Any, source: js.Any, keys: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def parse(json: String): CommentJSONValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any]).asInstanceOf[CommentJSONValue]
  inline def parse(json: String, reviver: Unit, removes_comments: Boolean): CommentJSONValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], removes_comments.asInstanceOf[js.Any])).asInstanceOf[CommentJSONValue]
  inline def parse(json: String, reviver: Reviver): CommentJSONValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[CommentJSONValue]
  inline def parse(json: String, reviver: Reviver, removes_comments: Boolean): CommentJSONValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], removes_comments.asInstanceOf[js.Any])).asInstanceOf[CommentJSONValue]
  
  inline def stringify(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Array[Double | String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Null, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Null, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: js.Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tokenize(input: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  inline def tokenize(input: String, config: TokenizeOptions): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  
  type CommentArray = js.Any
  
  type CommentJSONValue = js.Any
  
  type Reviver = js.Function2[/* k */ Double | String, /* v */ js.Any, js.Any]
  
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
    
    extension [Self <: Token](x: Self) {
      
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
    
    extension [Self <: TokenizeOptions](x: Self) {
      
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
}
