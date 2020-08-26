package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatabasesResult extends js.Object {
  var databaseNames: js.Array[String] = js.native
}

object ListDatabasesResult {
  @scala.inline
  def apply(databaseNames: js.Array[String]): ListDatabasesResult = {
    val __obj = js.Dynamic.literal(databaseNames = databaseNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatabasesResult]
  }
  @scala.inline
  implicit class ListDatabasesResultOps[Self <: ListDatabasesResult] (val x: Self) extends AnyVal {
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
    def setDatabaseNamesVarargs(value: String*): Self = this.set("databaseNames", js.Array(value :_*))
    @scala.inline
    def setDatabaseNames(value: js.Array[String]): Self = this.set("databaseNames", value.asInstanceOf[js.Any])
  }
  
}

