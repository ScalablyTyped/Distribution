package typings.cordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var cordova: Cordova
}

object Window {
  @scala.inline
  def apply(cordova: Cordova): Window = {
    val __obj = js.Dynamic.literal(cordova = cordova)
  
    __obj.asInstanceOf[Window]
  }
}

