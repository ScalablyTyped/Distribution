package typings.cytoscape.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://js.cytoscape.org/#core/data
  */
@js.native
trait CoreData extends StObject {
  
  /**
    * Get the entire data object or a particular data field.
    *
    * @param name The name of the field to get. Get the entire data object
    */
  def attr(): Any = js.native
  def attr(name: String): Any = js.native
  /**
    * Set a particular data field.
    *
    * @param name The name of the field to set.
    * @param value The value to set for the field.
    */
  def attr(name: String, value: Any): this.type = js.native
  /**
    * Update multiple data fields at once via an object.
    *
    * @param obj The object containing name-value pairs to update data fields.
    */
  def attr(obj: Record[String, Any]): this.type = js.native
  
  /**
    * Read and write developer-defined data associated with the graph.
    * http://js.cytoscape.org/#cy.data
    */
  /**
    * Get the entire data object or a particular data field.
    * @alias attr
    *
    * @param name The name of the field to get.
    */
  def data(): Any = js.native
  def data(name: String): Any = js.native
  /**
    * Set a particular data field.
    * @alias attr
    *
    * @param name The name of the field to set.
    * @param value The value to set for the field.
    */
  def data(name: String, value: Any): this.type = js.native
  /**
    * Update multiple data fields at once via an object.
    * @alias attr
    *
    * @param obj The object containing name-value pairs to update data fields.
    */
  def data(obj: Record[String, Any]): this.type = js.native
  
  /**
    * Remove developer-defined data associated with the elements.
    * https://js.cytoscape.org/#cy.removeData
    *
    * @param names A space-separated list of fields to delete.
    */
  def removeAttr(): this.type = js.native
  def removeAttr(names: String): this.type = js.native
  
  /**
    * Remove developer-defined data associated with the elements.
    * https://js.cytoscape.org/#cy.removeData
    * @alias removeAttr
    *
    * @param names A space-separated list of fields to delete.
    */
  def removeData(): this.type = js.native
  def removeData(names: String): this.type = js.native
}
