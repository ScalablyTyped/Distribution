package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step extends StObject {
  
  def getDescription(includeHtml: Boolean): String = js.native
  
  def getDistance(): String | Double = js.native
  def getDistance(format: Boolean): String | Double = js.native
  
  def getIndex(): Double = js.native
  
  def getPoint(): Point = js.native
  
  def getPosition(): Point = js.native
}
