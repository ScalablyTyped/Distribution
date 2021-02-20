package typings.commentJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("comment-json", "assign")
  @js.native
  def assign(target: js.Any, source: js.Any): js.Any = js.native
  @JSImport("comment-json", "assign")
  @js.native
  def assign(target: js.Any, source: js.Any, keys: js.Array[String]): js.Any = js.native
  
  @JSImport("comment-json", "parse")
  @js.native
  def parse(json: String): CommentJSONValue = js.native
  @JSImport("comment-json", "parse")
  @js.native
  def parse(json: String, reviver: js.UndefOr[scala.Nothing], removes_comments: Boolean): CommentJSONValue = js.native
  @JSImport("comment-json", "parse")
  @js.native
  def parse(json: String, reviver: Reviver): CommentJSONValue = js.native
  @JSImport("comment-json", "parse")
  @js.native
  def parse(json: String, reviver: Reviver, removes_comments: Boolean): CommentJSONValue = js.native
  
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any): String = js.native
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: String): String = js.native
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: Double): String = js.native
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: Null, space: String): String = js.native
  @JSImport("comment-json", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: Null, space: Double): String = js.native
  
  @JSImport("comment-json", "tokenize")
  @js.native
  def tokenize(input: String): js.Array[Token] = js.native
  @JSImport("comment-json", "tokenize")
  @js.native
  def tokenize(input: String, config: TokenizeOptions): js.Array[Token] = js.native
  
  type CommentArray = js.Any
  
  type CommentJSONValue = js.Any
  
  type Reviver = js.Function2[/* k */ Double | String, /* v */ js.Any, js.Any]
  
  @js.native
  trait Token extends StObject {
    
    var `type`: String = js.native
    
    var value: String = js.native
  }
  object Token {
    
    @scala.inline
    def apply(`type`: String, value: String): Token = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenizeOptions extends StObject {
    
    var comment: js.UndefOr[Boolean] = js.native
    
    var loc: js.UndefOr[Boolean] = js.native
    
    var range: js.UndefOr[Boolean] = js.native
    
    var tolerant: js.UndefOr[Boolean] = js.native
  }
  object TokenizeOptions {
    
    @scala.inline
    def apply(): TokenizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizeOptions]
    }
    
    @scala.inline
    implicit class TokenizeOptionsMutableBuilder[Self <: TokenizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setLoc(value: Boolean): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      @scala.inline
      def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
    }
  }
}
