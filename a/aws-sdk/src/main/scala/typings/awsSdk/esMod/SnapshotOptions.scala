package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotOptions extends StObject {
  
  /**
    * Specifies the time, in UTC format, when the service takes a daily automated snapshot of the specified Elasticsearch domain. Default value is 0 hours.
    */
  var AutomatedSnapshotStartHour: js.UndefOr[IntegerClass] = js.native
}
object SnapshotOptions {
  
  @scala.inline
  def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  @scala.inline
  implicit class SnapshotOptionsMutableBuilder[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatedSnapshotStartHour(value: IntegerClass): Self = StObject.set(x, "AutomatedSnapshotStartHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedSnapshotStartHourUndefined: Self = StObject.set(x, "AutomatedSnapshotStartHour", js.undefined)
  }
}
