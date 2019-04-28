package typings
package createDashHtmlDashElementLib.createDashHtmlDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-html-element", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Create a HTML element string.
  @example
  ```
  import createHtmlElement = require('create-html-element');
  createHtmlElement({
  	name: 'h1',
  	attributes: {
  		class: 'unicorn',
  		rainbow: true,
  		horse: false,
  		number: 1,
  		multiple: ['a', 'b']
  	},
  	html: '🦄'
  });
  //=> '<h1 class="unicorn" rainbow number="1" multiple="a b">🦄</h1>'
  createHtmlElement({text: 'Hello <em>World</em>'});
  //=> '<div>Hello &lt;em&gt;World&lt;/em&gt;</div>'
  ```
  */
  def apply(): java.lang.String = js.native
  def apply(options: Options): java.lang.String = js.native
}

