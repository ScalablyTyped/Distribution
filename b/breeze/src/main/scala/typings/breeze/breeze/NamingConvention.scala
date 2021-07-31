package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamingConvention extends StObject {
  
  def clientPropertyNameToServer(clientPropertyName: String): String = js.native
  def clientPropertyNameToServer(clientPropertyName: String, property: IProperty): String = js.native
  
  def serverPropertyNameToClient(serverPropertyName: String): String = js.native
  def serverPropertyNameToClient(serverPropertyName: String, property: IProperty): String = js.native
  
  def setAsDefault(): NamingConvention = js.native
}
