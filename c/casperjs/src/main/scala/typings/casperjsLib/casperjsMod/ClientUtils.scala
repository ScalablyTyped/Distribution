package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientUtils extends js.Object {
  def echo(message: java.lang.String): scala.Unit = js.native
  def encode(contents: java.lang.String): scala.Unit = js.native
  def exists(selector: java.lang.String): scala.Unit = js.native
  def findAll(selector: java.lang.String): scala.Unit = js.native
  def findOne(selector: java.lang.String): scala.Unit = js.native
  def getBase64(url: java.lang.String): scala.Unit = js.native
  def getBase64(url: java.lang.String, method: java.lang.String): scala.Unit = js.native
  def getBase64(url: java.lang.String, method: java.lang.String, data: js.Any): scala.Unit = js.native
  def getBinary(url: java.lang.String): scala.Unit = js.native
  def getBinary(url: java.lang.String, method: java.lang.String): scala.Unit = js.native
  def getBinary(url: java.lang.String, method: java.lang.String, data: js.Any): scala.Unit = js.native
  def getDocumentHeight(): scala.Unit = js.native
  def getElementBounds(selector: java.lang.String): scala.Unit = js.native
  def getElementByXPath(expression: java.lang.String): scala.Unit = js.native
  def getElementByXPath(expression: java.lang.String, scope: stdLib.HTMLElement): scala.Unit = js.native
  def getElementsBounds(selector: java.lang.String): scala.Unit = js.native
  def getElementsByXPath(expression: java.lang.String): scala.Unit = js.native
  def getElementsByXPath(expression: java.lang.String, scope: stdLib.HTMLElement): scala.Unit = js.native
  def getFieldValue(inputName: java.lang.String): scala.Unit = js.native
  def getFormValues(selector: java.lang.String): scala.Unit = js.native
  def mouseEvent(`type`: java.lang.String, selector: java.lang.String): scala.Unit = js.native
  def removeElementsByXPath(expression: java.lang.String): scala.Unit = js.native
  def sendAJAX(url: java.lang.String): scala.Unit = js.native
  def sendAJAX(url: java.lang.String, method: java.lang.String): scala.Unit = js.native
  def sendAJAX(url: java.lang.String, method: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendAJAX(url: java.lang.String, method: java.lang.String, data: js.Any, async: scala.Boolean): scala.Unit = js.native
  def visible(selector: java.lang.String): scala.Unit = js.native
}

