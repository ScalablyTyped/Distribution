package typings.awsSdk.global.AWS

import typings.awsSdk.ec2MetadataCredentialsMod.EC2MetadataCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AWS.EC2MetadataCredentials")
@js.native
/**
  * Creates credentials from the metadata service on an EC2 instance.
  * @param {object} options - Override the default (1s) timeout period.
  */
open class EC2MetadataCredentials ()
  extends typings.awsSdk.mod.EC2MetadataCredentials {
  def this(options: EC2MetadataCredentialsOptions) = this()
}
