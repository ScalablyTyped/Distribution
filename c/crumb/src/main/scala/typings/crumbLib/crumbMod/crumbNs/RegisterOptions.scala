package typings
package crumbLib.crumbMod.crumbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RegisterOptions extends js.Object {
  /**
           * Whether to automatically add the crumb to view contexts as the given key.
           *
           * @default true
           */
  var addToViewContext: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether to automatically generate a new crumb for requests.
           *
           * @default true
           */
  var autoGenerate: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Storage options for the cookie containing the crumb
           *
           * @default { path: '/' }
           */
  var cookieOptions: js.UndefOr[hapiLib.hapiMod.ServerStateCookieOptions] = js.undefined
  /**
           * Using enforce with false will set the CSRF header cookie but won't execute the validation.
           *
           * @default true
           */
  var enforce: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Specify the name of the custom CSRF header.
           *
           * @default 'X-CSRF-Token'
           */
  var headerName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The name of the cookie to store the CSRF crumb into.
           *
           * @default 'crumb'
           */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Whether to add to the request log with tag 'crumb' and data 'validation failed'.
           *
           * @default false
           */
  var logUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * RESTful mode that validates crumb tokens from 'X-CSRF-Token' request header for POST, PUT, PATCH and DELETE server routes.
           * Disables payload/query crumb validation.
           *
           * @default false
           */
  var restful: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The length of the crumb to generate.
           * See {@link https://github.com/hapijs/cryptiles cryptiles} for more information.
           *
           * @default 43
           */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
           * A function which when provided, is called for every request.
           * If the provided function returns true, validation and generation of crumb is skipped.
           *
           * @default false
           */
  var skip: js.UndefOr[scala.Boolean | SkipFunction] = js.undefined
}

