package typings.d3Require

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-require", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RequireError () extends Error
  
  @js.native
  trait require extends js.Object {
    /**
      * The resolver passed to `requireFrom`
      */
    @JSName("resolve")
    var resolve_Original: resolver = js.native
    def apply(name: String, names: String*): js.Promise[_] = js.native
    /**
      * Returns a `require` with the specified *aliases*.
      * `require.alias({"react": React, "react-dom": ReactDOM})`
      */
    def alias(aliases: StringDictionary[js.Any]): require = js.native
    /**
      * The resolver passed to `requireFrom`
      */
    def resolve(name: String): js.Promise[String] = js.native
    def resolve(name: String, base: String): js.Promise[String] = js.native
  }
  
  val requireFrom: typings.d3Require.mod.requireFrom = js.native
  @js.native
  object require extends TopLevel[require]
  
  type requireFrom = js.Function1[/* resolver */ resolver, require]
  type resolver = js.Function2[/* name */ String, /* base */ js.UndefOr[String], js.Promise[String]]
}

