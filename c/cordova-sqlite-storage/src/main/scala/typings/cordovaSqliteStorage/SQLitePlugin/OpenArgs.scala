package typings.cordovaSqliteStorage.SQLitePlugin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenArgs
  extends /* key */ StringDictionary[js.Any] {
  
  var androidDatabaseImplementation: js.UndefOr[Double] = js.native
  
  var androidLockWorkaround: js.UndefOr[Double] = js.native
  
  var createFromLocation: js.UndefOr[Double] = js.native
  
  var iosDatabaseLocation: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var name: String = js.native
}
object OpenArgs {
  
  @scala.inline
  def apply(name: String): OpenArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenArgs]
  }
  
  @scala.inline
  implicit class OpenArgsOps[Self <: OpenArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDatabaseImplementation(value: Double): Self = this.set("androidDatabaseImplementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidDatabaseImplementation: Self = this.set("androidDatabaseImplementation", js.undefined)
    
    @scala.inline
    def setAndroidLockWorkaround(value: Double): Self = this.set("androidLockWorkaround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidLockWorkaround: Self = this.set("androidLockWorkaround", js.undefined)
    
    @scala.inline
    def setCreateFromLocation(value: Double): Self = this.set("createFromLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFromLocation: Self = this.set("createFromLocation", js.undefined)
    
    @scala.inline
    def setIosDatabaseLocation(value: String): Self = this.set("iosDatabaseLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosDatabaseLocation: Self = this.set("iosDatabaseLocation", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
