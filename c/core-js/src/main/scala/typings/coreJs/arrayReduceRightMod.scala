package typings.coreJs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayReduceRightMod {
  
  /* was `typeof core.Array.reduceRight` */
  @scala.inline
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("core-js/library/fn/array/reduce-right", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
