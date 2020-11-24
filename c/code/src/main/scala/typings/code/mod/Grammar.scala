package typings.code.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grammar[T] extends js.Object {
  
  /** Connecting word. */
  var a: AssertionChain[T] = js.native
  
  /** Connecting word. */
  var an: AssertionChain[T] = js.native
  
  /** Connecting word. */
  var and: AssertionChain[T] = js.native
  
  /** Connecting word. */
  var at: AssertionChain[T] = js.native
  
  /** Connecting word. */
  var be: AssertionChain[T] = js.native
  
  /** Connecting word. */
  var have: AssertionChain[T] = js.native
  
  /** Connecting word. */
  var in: AssertionChain[T] = js.native
  
  /** Connecting word. */
  var to: AssertionChain[T] = js.native
}
object Grammar {
  
  @scala.inline
  def apply[T](
    a: AssertionChain[T],
    an: AssertionChain[T],
    and: AssertionChain[T],
    at: AssertionChain[T],
    be: AssertionChain[T],
    have: AssertionChain[T],
    in: AssertionChain[T],
    to: AssertionChain[T]
  ): Grammar[T] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], an = an.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammar[T]]
  }
  
  @scala.inline
  implicit class GrammarOps[Self <: Grammar[_], T] (val x: Self with Grammar[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setA(value: AssertionChain[T]): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAn(value: AssertionChain[T]): Self = this.set("an", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnd(value: AssertionChain[T]): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAt(value: AssertionChain[T]): Self = this.set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBe(value: AssertionChain[T]): Self = this.set("be", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHave(value: AssertionChain[T]): Self = this.set("have", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn(value: AssertionChain[T]): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: AssertionChain[T]): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
