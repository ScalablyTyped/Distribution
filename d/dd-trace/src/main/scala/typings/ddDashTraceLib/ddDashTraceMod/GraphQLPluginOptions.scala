package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLPluginOptions extends BasePluginOptions {
  /**
       * The maximum depth of fields/resolvers to instrument. Set to `0` to only
       * instrument the operation or to -1 to instrument all fields/resolvers.
       */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
       * A callback to enable recording of variables. By default, no variables are
       * recorded. For example, using `variables => variables` would record all
       * variables.
       */
  var variables: js.UndefOr[
    js.Function1[
      /* variables */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      stdLib.Partial[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ] = js.undefined
}

