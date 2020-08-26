package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParametersByPathRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[GetParametersByPathMaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Filters to limit the request results.
    */
  var ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.native
  /**
    * The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: /Finance/Prod/IAD/WinServ2016/license33 
    */
  var Path: PSParameterName = js.native
  /**
    * Retrieve all parameters within a hierarchy.  If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path /a, then the user can also access /a/b. Even if a user has explicitly been denied access in IAM for parameter /a/b, they can still call the GetParametersByPath API action recursively for /a and view /a/b. 
    */
  var Recursive: js.UndefOr[Boolean] = js.native
  /**
    * Retrieve all parameters in a hierarchy with their value decrypted.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.native
}

object GetParametersByPathRequest {
  @scala.inline
  def apply(Path: PSParameterName): GetParametersByPathRequest = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersByPathRequest]
  }
  @scala.inline
  implicit class GetParametersByPathRequestOps[Self <: GetParametersByPathRequest] (val x: Self) extends AnyVal {
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
    def setPath(value: PSParameterName): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: GetParametersByPathMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setParameterFiltersVarargs(value: ParameterStringFilter*): Self = this.set("ParameterFilters", js.Array(value :_*))
    @scala.inline
    def setParameterFilters(value: ParameterStringFilterList): Self = this.set("ParameterFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterFilters: Self = this.set("ParameterFilters", js.undefined)
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("Recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("Recursive", js.undefined)
    @scala.inline
    def setWithDecryption(value: Boolean): Self = this.set("WithDecryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithDecryption: Self = this.set("WithDecryption", js.undefined)
  }
  
}

