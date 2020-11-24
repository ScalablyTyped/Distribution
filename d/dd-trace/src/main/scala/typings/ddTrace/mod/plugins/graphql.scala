package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ddTrace.anon.Execute
import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [graphql](https://github.com/graphql/graphql-js) module.
  *
  * The `graphql` integration uses the operation name as the span resource name.
  * If no operation name is set, the resource name will always be just `query`,
  * `mutation` or `subscription`.
  *
  * For example:
  *
  * ```graphql
  * # good, the resource name will be `query HelloWorld`
  * query HelloWorld {
  *   hello
  *   world
  * }
  *
  * # bad, the resource name will be `query`
  * {
  *   hello
  *   world
  * }
  * ```
  */
@js.native
trait graphql
  extends Integration
     with Analyzable {
  
  /**
    * Whether to collapse list items into a single element. (i.e. single
    * `users.*.name` span instead of `users.0.name`, `users.1.name`, etc)
    *
    * @default true
    */
  var collapse: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum depth of fields/resolvers to instrument. Set to `0` to only
    * instrument the operation or to `-1` to instrument all fields/resolvers.
    *
    * @default -1
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * An object of optional callbacks to be executed during the respective
    * phase of a GraphQL operation. Undefined callbacks default to a noop
    * function.
    *
    * @default {}
    */
  var hooks: js.UndefOr[Execute] = js.native
  
  /**
    * Whether to enable signature calculation for the resource name. This can
    * be disabled if your GraphQL operations always have a name.
    *
    * @default true
    */
  var signature: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of variable names to record. Can also be a callback that returns
    * the key/value pairs to record. For example, using
    * `variables => variables` would record all variables.
    */
  var variables: js.UndefOr[
    js.Array[String] | (js.Function1[/* variables */ StringDictionary[js.Any], StringDictionary[_]])
  ] = js.native
}
object graphql {
  
  @scala.inline
  def apply(): graphql = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[graphql]
  }
  
  @scala.inline
  implicit class graphqlOps[Self <: graphql] (val x: Self) extends AnyVal {
    
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
    def setCollapse(value: Boolean): Self = this.set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setHooks(value: Execute): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setSignature(value: Boolean): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setVariablesVarargs(value: String*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariablesFunction1(value: /* variables */ StringDictionary[js.Any] => StringDictionary[_]): Self = this.set("variables", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVariables(
      value: js.Array[String] | (js.Function1[/* variables */ StringDictionary[js.Any], StringDictionary[_]])
    ): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
