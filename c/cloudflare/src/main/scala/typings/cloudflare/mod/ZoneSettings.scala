package typings.cloudflare.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneSettings extends StObject {
  
  def browse(id: String): ResponseObjectPromise = js.native
  
  def edit(id: String, setting: String, value: String): ResponseObjectPromise = js.native
  def edit(id: String, setting: String, value: Record[String, Any]): ResponseObjectPromise = js.native
  
  def editAll(id: String, settings: Any): ResponseObjectPromise = js.native
  
  def read(id: String, setting: String): ResponseObjectPromise = js.native
}
