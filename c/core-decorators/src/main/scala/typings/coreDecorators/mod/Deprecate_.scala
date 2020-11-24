package typings.coreDecorators.mod

import typings.std.MethodDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deprecate_ extends MethodDecorator {
  
  def apply(): MethodDecorator = js.native
  def apply(message: js.UndefOr[scala.Nothing], option: DeprecateOption): MethodDecorator = js.native
  def apply(message: String): MethodDecorator = js.native
  def apply(message: String, option: DeprecateOption): MethodDecorator = js.native
}
