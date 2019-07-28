package typings.azureDashMobileDashServicesDashClient.MicrosoftNs.WindowsAzureNs

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// MobileServiceTable object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554239.aspx
@js.native
trait MobileServiceTable
  extends IQuery
     with Instantiable2[/* tableName */ String, /* client */ MobileServiceClient, MobileServiceTable] {
  def del(instance: js.Any): asyncPromise = js.native
  def del(instance: js.Any, paramsQS: js.Object): asyncPromise = js.native
  def del(
    instance: js.Any,
    paramsQS: js.Object,
    callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def getMobileServiceClient(): MobileServiceClient = js.native
  def getTableName(): String = js.native
  def insert(instance: js.Any): asyncPromise = js.native
  def insert(instance: js.Any, paramsQS: js.Object): asyncPromise = js.native
  def insert(
    instance: js.Any,
    paramsQS: js.Object,
    callback: js.Function2[/* error */ js.Any, /* retInserted */ js.Any, _]
  ): Unit = js.native
  def lookup(id: Double): asyncPromise = js.native
  def lookup(id: Double, paramsQS: js.Object): asyncPromise = js.native
  def lookup(
    id: Double,
    paramsQS: js.Object,
    callback: js.Function2[/* error */ js.Any, /* retValue */ js.Any, _]
  ): Unit = js.native
  def read(query: IQuery): asyncPromise = js.native
  def read(query: IQuery, paramsQS: js.Object): asyncPromise = js.native
  def read(
    query: IQuery,
    paramsQS: js.Object,
    callback: js.Function2[/* error */ js.Any, /* retValues */ js.Any, _]
  ): Unit = js.native
  def update(instance: js.Any): asyncPromise = js.native
  def update(instance: js.Any, paramsQS: js.Object): asyncPromise = js.native
  def update(
    instance: js.Any,
    paramsQS: js.Object,
    callback: js.Function2[/* error */ js.Any, /* retUpdated */ js.Any, _]
  ): Unit = js.native
}

