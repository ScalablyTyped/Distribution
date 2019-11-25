package typings.cypress.typesSinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeServerOptions extends js.Object {
  /**
    * When set to true, causes the server to automatically respond to incoming requests after a timeout.
    * The default timeout is 10ms but you can control it through the autoRespondAfter property.
    * Note that this feature is intended to help during mockup development, and is not suitable for use in tests.
    */
  var autoRespond: Boolean
  /**
    * When autoRespond is true, respond to requests after this number of milliseconds. Default is 10.
    */
  var autoRespondAfter: Double
  /**
    * If set to true, server will find _method parameter in POST body and recognize that as the actual method.
    * Supports a pattern common to Ruby on Rails applications. For custom HTTP method faking, override server.getHTTPMethod(request).
    */
  var fakeHTTPMethods: Boolean
  /**
    * If set, the server will respond to every request immediately and synchronously.
    * This is ideal for faking the server from within a test without having to call server.respond() after each request made in that test.
    * As this is synchronous and immediate, this is not suitable for simulating actual network latency in tests or mockups.
    * To simulate network latency with automatic responses, see server.autoRespond and server.autoRespondAfter.
    */
  var respondImmediately: Boolean
}

object SinonFakeServerOptions {
  @scala.inline
  def apply(
    autoRespond: Boolean,
    autoRespondAfter: Double,
    fakeHTTPMethods: Boolean,
    respondImmediately: Boolean
  ): SinonFakeServerOptions = {
    val __obj = js.Dynamic.literal(autoRespond = autoRespond.asInstanceOf[js.Any], autoRespondAfter = autoRespondAfter.asInstanceOf[js.Any], fakeHTTPMethods = fakeHTTPMethods.asInstanceOf[js.Any], respondImmediately = respondImmediately.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SinonFakeServerOptions]
  }
}

