package typings.chance.Chance

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  comparator :(array : std.Array<T>, value : T): boolean | undefined} & chance.Chance.Options */
@js.native
trait UniqueOptions[T]
  extends /* id */ StringDictionary[js.Any] {
  
  var comparator: js.UndefOr[js.Function2[/* array */ js.Array[T], /* value */ T, Boolean]] = js.native
}
object UniqueOptions {
  
  @scala.inline
  def apply[T](): UniqueOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueOptions[T]]
  }
  
  @scala.inline
  implicit class UniqueOptionsMutableBuilder[Self <: UniqueOptions[_], T] (val x: Self with UniqueOptions[T]) extends AnyVal {
    
    @scala.inline
    def setComparator(value: (/* array */ js.Array[T], /* value */ T) => Boolean): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
  }
}
