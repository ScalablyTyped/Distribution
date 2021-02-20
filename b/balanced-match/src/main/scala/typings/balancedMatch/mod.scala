package typings.balancedMatch

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *
    * For the first non-nested matching pair of a and b in str, return an object with those keys:
    * start the index of the first match of
    * `end` the index of the matching b
    * `pre` the preamble, a and b not included
    * `body` the match, a and b not included
    * `post` the postscript, a and b not included
    * If there's no match, `undefined` will be returned.
    * If the `str` contains more a than b / there are unmatched pairs,
    * the first match that was closed will be used.
    * For example, `{{a}` will match `['{', 'a', '']` and `{a}}` will match `['', 'a', '}']`
    */
  @JSImport("balanced-match", JSImport.Namespace)
  @js.native
  def apply(a: String, b: String, str: String): Output | Unit = js.native
  @JSImport("balanced-match", JSImport.Namespace)
  @js.native
  def apply(a: String, b: RegExp, str: String): Output | Unit = js.native
  @JSImport("balanced-match", JSImport.Namespace)
  @js.native
  def apply(a: RegExp, b: String, str: String): Output | Unit = js.native
  @JSImport("balanced-match", JSImport.Namespace)
  @js.native
  def apply(a: RegExp, b: RegExp, str: String): Output | Unit = js.native
  
  /**
    * For the first non-nested matching pair of `a` and `b` in `str`,
    * return an array with indexes: `[ <a index>, <b index> ]`.
    */
  @JSImport("balanced-match", "range")
  @js.native
  def range(a: String, b: String, str: String): Output | Unit = js.native
  @JSImport("balanced-match", "range")
  @js.native
  def range(a: String, b: RegExp, str: String): Output | Unit = js.native
  @JSImport("balanced-match", "range")
  @js.native
  def range(a: RegExp, b: String, str: String): Output | Unit = js.native
  @JSImport("balanced-match", "range")
  @js.native
  def range(a: RegExp, b: RegExp, str: String): Output | Unit = js.native
  
  @js.native
  trait Output extends StObject {
    
    /**
      * The match, a and b not included
      */
    var body: String = js.native
    
    /**
      * The index of the matching b
      */
    var end: Double = js.native
    
    /**
      * The postscript, a and b not included
      */
    var post: String = js.native
    
    /**
      * The preamble, a and b not included
      */
    var pre: String = js.native
    
    /**
      * The index of the first match of a
      */
    var start: Double = js.native
  }
  object Output {
    
    @scala.inline
    def apply(body: String, end: Double, post: String, pre: String, start: Double): Output = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPre(value: String): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
