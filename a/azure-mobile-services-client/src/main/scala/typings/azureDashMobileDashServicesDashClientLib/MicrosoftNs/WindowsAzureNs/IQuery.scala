package typings
package azureDashMobileDashServicesDashClientLib.MicrosoftNs.WindowsAzureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interface to describe Query object fluent creation based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj613353.aspx
@js.native
trait IQuery extends js.Object {
  def includeTotalCount(): IQuery = js.native
  def orderBy(propName: java.lang.String*): IQuery = js.native
  def orderByDescending(propName: java.lang.String*): IQuery = js.native
  def read(): asyncPromise = js.native
  def read(paramsQS: js.Object): asyncPromise = js.native
  def select(funcProjectionFromThis: js.Function0[_]): IQuery = js.native
  def select(propNameSelected: java.lang.String*): IQuery = js.native
  def skip(n: scala.Double): IQuery = js.native
  def take(n: scala.Double): IQuery = js.native
  def where(funcPredicateOnThis: js.Function1[/* repeated */js.Any, scala.Boolean], qValues: js.Any*): IQuery = js.native
  def where(mapObjFilterCriteria: js.Any): IQuery = js.native
}

