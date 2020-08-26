package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * An Amazon DynamoDB table location.
    */
  var DynamoDB: js.UndefOr[CodeGenNodeArgs] = js.native
  /**
    * A JDBC location.
    */
  var Jdbc: js.UndefOr[CodeGenNodeArgs] = js.native
  /**
    * An Amazon Simple Storage Service (Amazon S3) location.
    */
  var S3: js.UndefOr[CodeGenNodeArgs] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setDynamoDBVarargs(value: CodeGenNodeArg*): Self = this.set("DynamoDB", js.Array(value :_*))
    @scala.inline
    def setDynamoDB(value: CodeGenNodeArgs): Self = this.set("DynamoDB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamoDB: Self = this.set("DynamoDB", js.undefined)
    @scala.inline
    def setJdbcVarargs(value: CodeGenNodeArg*): Self = this.set("Jdbc", js.Array(value :_*))
    @scala.inline
    def setJdbc(value: CodeGenNodeArgs): Self = this.set("Jdbc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJdbc: Self = this.set("Jdbc", js.undefined)
    @scala.inline
    def setS3Varargs(value: CodeGenNodeArg*): Self = this.set("S3", js.Array(value :_*))
    @scala.inline
    def setS3(value: CodeGenNodeArgs): Self = this.set("S3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3: Self = this.set("S3", js.undefined)
  }
  
}

