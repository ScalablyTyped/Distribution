package typings.casperjs.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientUtils extends js.Object {
  def echo(message: String): Unit = js.native
  def encode(contents: String): Unit = js.native
  def exists(selector: String): Unit = js.native
  def findAll(selector: String): Unit = js.native
  def findOne(selector: String): Unit = js.native
  def getBase64(url: String): Unit = js.native
  def getBase64(url: String, method: String): Unit = js.native
  def getBase64(url: String, method: String, data: js.Any): Unit = js.native
  def getBinary(url: String): Unit = js.native
  def getBinary(url: String, method: String): Unit = js.native
  def getBinary(url: String, method: String, data: js.Any): Unit = js.native
  def getDocumentHeight(): Unit = js.native
  def getElementBounds(selector: String): Unit = js.native
  def getElementByXPath(expression: String): Unit = js.native
  def getElementByXPath(expression: String, scope: HTMLElement): Unit = js.native
  def getElementsBounds(selector: String): Unit = js.native
  def getElementsByXPath(expression: String): Unit = js.native
  def getElementsByXPath(expression: String, scope: HTMLElement): Unit = js.native
  def getFieldValue(inputName: String): Unit = js.native
  def getFormValues(selector: String): Unit = js.native
  def mouseEvent(`type`: String, selector: String): Unit = js.native
  def removeElementsByXPath(expression: String): Unit = js.native
  def sendAJAX(url: String): Unit = js.native
  def sendAJAX(url: String, method: String): Unit = js.native
  def sendAJAX(url: String, method: String, data: js.Any): Unit = js.native
  def sendAJAX(url: String, method: String, data: js.Any, async: Boolean): Unit = js.native
  def visible(selector: String): Unit = js.native
}

