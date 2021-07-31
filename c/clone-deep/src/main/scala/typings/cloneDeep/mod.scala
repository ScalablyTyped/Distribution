package typings.cloneDeep

import typings.cloneDeep.cloneDeepBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def apply[T](`val`: T, instanceClone: js.Function1[/* val */ T, T]): T = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], instanceClone.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def apply[T](`val`: T, instanceClone: `true`): T = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], instanceClone.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("clone-deep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
