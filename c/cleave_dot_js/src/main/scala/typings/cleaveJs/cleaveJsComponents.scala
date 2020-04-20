package typings.cleaveJs

import typings.cleaveJs.reactMod.^
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cleaveJsComponents extends cleaveJsProps {
  @scala.inline
  def React: ComponentType[ReactProps] = js.constructorOf[^].asInstanceOf[ComponentType[ReactProps]]
}

