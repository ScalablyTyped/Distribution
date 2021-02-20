package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassPrivateMethod
import typings.babelTypes.babelTypesStrings.ClassPrivateProperty
import typings.babelTypes.babelTypesStrings.PrivateName
import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ClassPrivateProperty_
  - typings.babelTypes.mod.ClassPrivateMethod_
  - typings.babelTypes.mod.PrivateName_
*/
trait Private extends _Node
object Private {
  
  @scala.inline
  def ClassPrivateMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: PrivateName_,
    kind: get | set | method | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean,
    `type`: ClassPrivateMethod
  ): typings.babelTypes.mod.ClassPrivateMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ClassPrivateMethod_]
  }
  
  @scala.inline
  def ClassPrivateProperty_(key: PrivateName_, static: js.Any, `type`: ClassPrivateProperty): typings.babelTypes.mod.ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ClassPrivateProperty_]
  }
  
  @scala.inline
  def PrivateName_(id: Identifier_, `type`: PrivateName): typings.babelTypes.mod.PrivateName_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.PrivateName_]
  }
}
