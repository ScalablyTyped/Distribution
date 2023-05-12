package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "BSONRuntimeError")
@js.native
open class BSONRuntimeError protected () extends BSONError {
  def this(message: String) = this()
  
  @JSName("name")
  def name_MBSONRuntimeError: typings.bson.bsonStrings.BSONRuntimeError = js.native
}
