package typings.typescriptNn5FuAjk

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object providing methods which are not dependent on any particular document. Such an object is returned by the Document.implementation property. */
@js.native
trait DOMImplementation extends StObject {
  
  def createDocument(): XMLDocument = js.native
  def createDocument(namespace: java.lang.String): XMLDocument = js.native
  def createDocument(namespace: java.lang.String, qualifiedName: java.lang.String): XMLDocument = js.native
  def createDocument(namespace: java.lang.String, qualifiedName: java.lang.String, doctype: DocumentType): XMLDocument = js.native
  def createDocument(namespace: java.lang.String, qualifiedName: Null, doctype: DocumentType): XMLDocument = js.native
  def createDocument(namespace: Null, qualifiedName: java.lang.String): XMLDocument = js.native
  def createDocument(namespace: Null, qualifiedName: java.lang.String, doctype: DocumentType): XMLDocument = js.native
  def createDocument(namespace: Null, qualifiedName: Null, doctype: DocumentType): XMLDocument = js.native
  
  def createDocumentType(qualifiedName: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): DocumentType = js.native
  
  def createHTMLDocument(): Document = js.native
  def createHTMLDocument(title: java.lang.String): Document = js.native
  
  /** @deprecated */
  def hasFeature(args: Any*): `true` = js.native
}
