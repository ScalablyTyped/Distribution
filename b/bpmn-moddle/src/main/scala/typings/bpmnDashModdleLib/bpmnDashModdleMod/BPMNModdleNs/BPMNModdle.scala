package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def fromXML(xmlStr: java.lang.String, done: ImportFn): scala.Unit = js.native
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
  def fromXML(xmlStr: java.lang.String, options: Option, done: ImportFn): scala.Unit = js.native
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
  def fromXML(xmlStr: java.lang.String, typeName: java.lang.String, options: Option, done: ImportFn): scala.Unit = js.native
}

