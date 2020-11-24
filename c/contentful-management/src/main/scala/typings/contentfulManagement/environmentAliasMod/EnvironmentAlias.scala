package typings.contentfulManagement.environmentAliasMod

import typings.contentfulManagement.anon.OmitEnvironmentAliasProps
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentAlias
  extends EnvironmentAliasProps
     with DefaultElements[EnvironmentAliasProps] {
  
  /**
    * Sends an update to the server with any changes made to the object's properties. Currently, you can only change the id of the alias's underlying environment. See the example below.
    * @memberof EnvironmentAlias
    * @func update
    * @return {Promise<EnvironmentAlias>} Object returned from the server with updated changes.
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getEnvironmentAlias('<environment_alias_id>'))
    * .then((alias) => {
    *   alias.environment.sys.id = '<environment_id>'
    *   return alias.update()
    * })
    * .then((alias) => console.log(`alias ${alias.sys.id} updated.`))
    * .catch(console.error)
    * ```
    */
  def update(data: OmitEnvironmentAliasProps): js.Promise[EnvironmentAlias] = js.native
}
object EnvironmentAlias {
  
  @scala.inline
  def apply(
    environment: MetaLinkProps,
    sys: MetaSysProps,
    toPlainObject: () => EnvironmentAliasProps,
    update: OmitEnvironmentAliasProps => js.Promise[EnvironmentAlias]
  ): EnvironmentAlias = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EnvironmentAlias]
  }
  
  @scala.inline
  implicit class EnvironmentAliasOps[Self <: EnvironmentAlias] (val x: Self) extends AnyVal {
    
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
    def setUpdate(value: OmitEnvironmentAliasProps => js.Promise[EnvironmentAlias]): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
