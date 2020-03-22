package typings.cypress.cypressMod.Cypress

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserLaunchOptions extends js.Object {
  var args: js.Array[String]
  var extensions: js.Array[String]
  var preferences: StringDictionary[js.Any]
}

object BrowserLaunchOptions {
  @scala.inline
  def apply(args: js.Array[String], extensions: js.Array[String], preferences: StringDictionary[js.Any]): BrowserLaunchOptions = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], preferences = preferences.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BrowserLaunchOptions]
  }
}

