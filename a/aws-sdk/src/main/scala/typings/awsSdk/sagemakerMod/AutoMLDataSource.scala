package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLDataSource extends js.Object {
  /**
    * The Amazon S3 location of the input data.  The input data must be in CSV format and contain at least 1000 rows. 
    */
  var S3DataSource: AutoMLS3DataSource = js.native
}

object AutoMLDataSource {
  @scala.inline
  def apply(S3DataSource: AutoMLS3DataSource): AutoMLDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLDataSource]
  }
  @scala.inline
  implicit class AutoMLDataSourceOps[Self <: AutoMLDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setS3DataSource(value: AutoMLS3DataSource): Self = this.set("S3DataSource", value.asInstanceOf[js.Any])
  }
  
}

