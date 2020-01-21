package typings.cordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var cordova: Cordova_
}

object Window {
  @scala.inline
  def apply(cordova: Cordova_): Window = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

