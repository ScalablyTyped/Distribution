package typings.awsSdk.cloudfrontSignerMod

import typings.awsSdk.cloudfrontSignerMod.Signer.CannedPolicy
import typings.awsSdk.cloudfrontSignerMod.Signer.CustomPolicy
import typings.awsSdk.cloudfrontSignerMod.Signer.SignerOptionsWithPolicy
import typings.awsSdk.cloudfrontSignerMod.Signer.SignerOptionsWithoutPolicy
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/cloudfront/signer", "Signer")
@js.native
class Signer_ protected () extends js.Object {
  /**
    * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
    * 
    * @param {string} keyPairId - The ID of the CloudFront key pair being used.
    * @param {string} privateKey - A private key in RSA format.
    */
  def this(keyPairId: String, privateKey: String) = this()
  /**
    * Create a signed Amazon CloudFront Cookie.
    */
  def getSignedCookie(options: SignerOptionsWithPolicy): CustomPolicy = js.native
  /**
    * Create a signed Amazon CloudFront Cookie.
    */
  def getSignedCookie(
    options: SignerOptionsWithPolicy,
    callback: js.Function2[/* err */ Error, /* cookie */ CustomPolicy, Unit]
  ): Unit = js.native
  /**
    * Create a signed Amazon CloudFront Cookie.
    */
  def getSignedCookie(options: SignerOptionsWithoutPolicy): CannedPolicy = js.native
  /**
    * Create a signed Amazon CloudFront Cookie.
    */
  def getSignedCookie(
    options: SignerOptionsWithoutPolicy,
    callback: js.Function2[/* err */ Error, /* cookie */ CannedPolicy, Unit]
  ): Unit = js.native
  /**
    * Create a signed Amazon CloudFront URL.
    * Keep in mind that URLs meant for use in media/flash players may have different requirements for URL formats (e.g. some require that the extension be removed, some require the file name to be prefixed - mp4:, some require you to add "/cfx/st" into your URL).
    */
  def getSignedUrl(options: SignerOptionsWithPolicy): String = js.native
  /**
    * Create a signed Amazon CloudFront URL.
    * Keep in mind that URLs meant for use in media/flash players may have different requirements for URL formats (e.g. some require that the extension be removed, some require the file name to be prefixed - mp4:, some require you to add "/cfx/st" into your URL).
    */
  def getSignedUrl(options: SignerOptionsWithPolicy, callback: js.Function2[/* err */ Error, /* url */ String, Unit]): Unit = js.native
  def getSignedUrl(options: SignerOptionsWithoutPolicy): String = js.native
  def getSignedUrl(
    options: SignerOptionsWithoutPolicy,
    callback: js.Function2[/* err */ Error, /* url */ String, Unit]
  ): Unit = js.native
}

