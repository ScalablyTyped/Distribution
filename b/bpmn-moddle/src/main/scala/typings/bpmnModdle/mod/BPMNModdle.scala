package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BPMNModdle extends Moddle {
  
  /**
    * Instantiates a BPMN model tree from a given xml string.
    *
    * @param xmlStr
    * XML string
    *
    * @param done
    * done callback
    */
  def fromXML(xmlStr: String, done: ImportFn): Unit = js.native
  /**
    * Instantiates a BPMN model tree from a given xml string.
    *
    * @param xmlStr
    * XML string
    *
    * @param options
    * Options to pass to the underlying reader
    *
    * @param done
    * done callback
    */
  def fromXML(xmlStr: String, options: Option, done: ImportFn): Unit = js.native
  /**
    * Instantiates a BPMN model tree from a given xml string.
    *
    * @param xmlStr
    * XML string
    *
    * @param typeName
    * Name of the root element
    *
    * @param options
    * Options to pass to the underlying reader
    *
    * @param done
    * done callback
    */
  def fromXML(xmlStr: String, typeName: String, options: Option, done: ImportFn): Unit = js.native
}
