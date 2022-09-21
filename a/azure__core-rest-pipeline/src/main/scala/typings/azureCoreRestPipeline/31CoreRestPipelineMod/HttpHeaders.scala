package typings.azureCoreRestPipeline.`31CoreRestPipelineMod`

import typings.azureCoreRestPipeline.anon.PreserveCase
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpHeaders
  extends StObject
     with Iterable[js.Tuple2[String, String]] {
  
  /**
    * Removes a specific header from the collection.
    * @param name - The name of the header to delete.
    */
  def delete(name: String): Unit = js.native
  
  /**
    * Returns the value of a specific header or undefined if not set.
    * @param name - The name of the header to retrieve.
    */
  def get(name: String): js.UndefOr[String] = js.native
  
  /**
    * Returns true if the specified header exists.
    * @param name - The name of the header to check.
    */
  def has(name: String): Boolean = js.native
  
  /**
    * Sets a specific header with a given value.
    * @param name - The name of the header to set.
    * @param value - The value to use for the header.
    */
  def set(name: String, value: String): Unit = js.native
  def set(name: String, value: Boolean): Unit = js.native
  def set(name: String, value: Double): Unit = js.native
  
  /**
    * Accesses a raw JS object that acts as a simple map
    * of header names to values.
    */
  def toJSON(): RawHttpHeaders = js.native
  def toJSON(options: PreserveCase): RawHttpHeaders = js.native
}
