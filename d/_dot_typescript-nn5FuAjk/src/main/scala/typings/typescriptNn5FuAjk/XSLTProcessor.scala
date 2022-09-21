package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <xsl:param> parameter values, and to apply the transformation to documents. */
@js.native
trait XSLTProcessor extends StObject {
  
  def clearParameters(): Unit = js.native
  
  def getParameter(namespaceURI: java.lang.String, localName: java.lang.String): Any = js.native
  def getParameter(namespaceURI: Null, localName: java.lang.String): Any = js.native
  
  def importStylesheet(style: Node): Unit = js.native
  
  def removeParameter(namespaceURI: java.lang.String, localName: java.lang.String): Unit = js.native
  def removeParameter(namespaceURI: Null, localName: java.lang.String): Unit = js.native
  
  def reset(): Unit = js.native
  
  def setParameter(namespaceURI: java.lang.String, localName: java.lang.String, value: Any): Unit = js.native
  def setParameter(namespaceURI: Null, localName: java.lang.String, value: Any): Unit = js.native
  
  def transformToDocument(source: Node): Document = js.native
  
  def transformToFragment(source: Node, output: Document): DocumentFragment = js.native
}
