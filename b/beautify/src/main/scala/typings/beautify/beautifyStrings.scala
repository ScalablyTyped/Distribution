package typings.beautify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beautifyStrings {
  
  @scala.inline
  def css: css = "css".asInstanceOf[css]
  
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
  
  @js.native
  sealed trait css extends js.Object
  
  @js.native
  sealed trait html extends js.Object
  
  @js.native
  sealed trait js_ extends js.Object
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait xml extends js.Object
}
