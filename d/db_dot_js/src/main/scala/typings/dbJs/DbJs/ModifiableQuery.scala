package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifiableQuery[T] extends StObject {
  
  def modify(filter: js.Function1[/* value */ T, Boolean]): ExecutableQuery[T] = js.native
  def modify(modifyObj: js.Any): ExecutableQuery[T] = js.native
}
