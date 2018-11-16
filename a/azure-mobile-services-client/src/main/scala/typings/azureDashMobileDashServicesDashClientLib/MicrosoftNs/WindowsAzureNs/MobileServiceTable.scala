package typings
package azureDashMobileDashServicesDashClientLib.MicrosoftNs.WindowsAzureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// MobileServiceTable object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554239.aspx
@js.native
trait MobileServiceTable
  extends IQuery
     with ScalablyTyped.runtime.Instantiable2[
      /* tableName */ java.lang.String, 
      /* client */ MobileServiceClient, 
      MobileServiceTable
    ] {
  def del(instance: js.Any): asyncPromise = js.native
  def del(instance: js.Any, paramsQS: js.Object): asyncPromise = js.native
  def del(
    instance: js.Any,
    paramsQS: js.Object,
    callback: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def getMobileServiceClient(): MobileServiceClient = js.native
  def getTableName(): java.lang.String = js.native
  def insert(instance: js.Any): asyncPromise = js.native
  def insert(instance: js.Any, paramsQS: js.Object): asyncPromise = js.native
  def insert(
    instance: js.Any,
    paramsQS: js.Object,
    callback: js.Function2[/* error */ js.Any, /* retInserted */ js.Any, _]
  ): scala.Unit = js.native
  def lookup(id: scala.Double): asyncPromise = js.native
  def lookup(id: scala.Double, paramsQS: js.Object): asyncPromise = js.native
  def lookup(
    id: scala.Double,
    paramsQS: js.Object,
    callback: js.Function2[/* error */ js.Any, /* retValue */ js.Any, _]
  ): scala.Unit = js.native
  def read(query: IQuery): asyncPromise = js.native
  def read(query: IQuery, paramsQS: js.Object): asyncPromise = js.native
  def read(
    query: IQuery,
    paramsQS: js.Object,
    callback: js.Function2[/* error */ js.Any, /* retValues */ js.Any, _]
  ): scala.Unit = js.native
  def update(instance: js.Any): asyncPromise = js.native
  def update(instance: js.Any, paramsQS: js.Object): asyncPromise = js.native
  def update(
    instance: js.Any,
    paramsQS: js.Object,
    callback: js.Function2[/* error */ js.Any, /* retUpdated */ js.Any, _]
  ): scala.Unit = js.native
}

