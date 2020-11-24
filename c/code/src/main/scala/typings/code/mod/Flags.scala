package typings.code.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flags[T] extends js.Object {
  
  /** Inverses the expected result of any assertion */
  var not: AssertionChain[T] = js.native
  
  /**
    * Requires that inclusion matches appear only once in the provided value.
    * Used by include().
    */
  var once: AssertionChain[T] = js.native
  
  /**
    * Requires that only the provided elements appear in the provided value.
    * Used by include().
    */
  var only: AssertionChain[T] = js.native
  
  /**
    * Allows a partial match when asserting inclusion
    * Used by include(). Defaults to false.
    */
  var part: AssertionChain[T] = js.native
  
  /**
    * Performs a comparison using strict equality (===).
    * Code defaults to deep comparison. Used by equal() and include().
    */
  var shallow: AssertionChain[T] = js.native
}
object Flags {
  
  @scala.inline
  def apply[T](
    not: AssertionChain[T],
    once: AssertionChain[T],
    only: AssertionChain[T],
    part: AssertionChain[T],
    shallow: AssertionChain[T]
  ): Flags[T] = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags[T]]
  }
  
  @scala.inline
  implicit class FlagsOps[Self <: Flags[_], T] (val x: Self with Flags[T]) extends AnyVal {
    
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
    def setNot(value: AssertionChain[T]): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnce(value: AssertionChain[T]): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly(value: AssertionChain[T]): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPart(value: AssertionChain[T]): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShallow(value: AssertionChain[T]): Self = this.set("shallow", value.asInstanceOf[js.Any])
  }
}
