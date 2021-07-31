package typings.cadesplugin.CAPICOM

import typings.cadesplugin.CADESCommon.ValuesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificates extends StObject {
  
  val Count: Double = js.native
  
  def Find(findType: ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE]): Certificates = js.native
  def Find(findType: ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], varCriteria: js.Any): Certificates = js.native
  def Find(findType: ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], varCriteria: js.Any, bFindValidOnly: Boolean): Certificates = js.native
  def Find(findType: ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], varCriteria: Unit, bFindValidOnly: Boolean): Certificates = js.native
  
  def Item(index: Double): Certificate = js.native
  
  def Select(): Certificates = js.native
  def Select(title: String): Certificates = js.native
  def Select(title: String, displayString: String): Certificates = js.native
  def Select(title: String, displayString: String, bMultiSelect: Boolean): Certificates = js.native
  def Select(title: String, displayString: Unit, bMultiSelect: Boolean): Certificates = js.native
  def Select(title: Unit, displayString: String): Certificates = js.native
  def Select(title: Unit, displayString: String, bMultiSelect: Boolean): Certificates = js.native
  def Select(title: Unit, displayString: Unit, bMultiSelect: Boolean): Certificates = js.native
}
