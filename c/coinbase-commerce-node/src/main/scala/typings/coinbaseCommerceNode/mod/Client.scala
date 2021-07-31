package typings.coinbaseCommerceNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Client {
  
  @JSImport("coinbase-commerce-node", "Client")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Setup client.
    */
  @scala.inline
  def init(apiKey: String): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Options]
  @scala.inline
  def init(apiKey: String, baseApiUrl: String): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], baseApiUrl.asInstanceOf[js.Any])).asInstanceOf[Options]
  @scala.inline
  def init(apiKey: String, baseApiUrl: String, apiVersion: String): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], baseApiUrl.asInstanceOf[js.Any], apiVersion.asInstanceOf[js.Any])).asInstanceOf[Options]
  @scala.inline
  def init(apiKey: String, baseApiUrl: String, apiVersion: String, timeout: Double): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], baseApiUrl.asInstanceOf[js.Any], apiVersion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Options]
  @scala.inline
  def init(apiKey: String, baseApiUrl: String, apiVersion: Unit, timeout: Double): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], baseApiUrl.asInstanceOf[js.Any], apiVersion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Options]
  @scala.inline
  def init(apiKey: String, baseApiUrl: Unit, apiVersion: String): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], baseApiUrl.asInstanceOf[js.Any], apiVersion.asInstanceOf[js.Any])).asInstanceOf[Options]
  @scala.inline
  def init(apiKey: String, baseApiUrl: Unit, apiVersion: String, timeout: Double): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], baseApiUrl.asInstanceOf[js.Any], apiVersion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Options]
  @scala.inline
  def init(apiKey: String, baseApiUrl: Unit, apiVersion: Unit, timeout: Double): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], baseApiUrl.asInstanceOf[js.Any], apiVersion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Options]
}
