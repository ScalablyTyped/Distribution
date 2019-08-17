package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreServerSideEncryptionConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreServerSideEncryptionRuleMod._UnmarshalledServerSideEncryptionRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledServerSideEncryptionConfiguration extends _ServerSideEncryptionConfiguration {
  /**
    * <p>Container for information about a particular server-side encryption configuration rule.</p>
    */
  @JSName("Rules")
  var Rules__UnmarshalledServerSideEncryptionConfiguration: js.Array[_UnmarshalledServerSideEncryptionRule]
}

object _UnmarshalledServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: js.Array[_UnmarshalledServerSideEncryptionRule]): _UnmarshalledServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules)
  
    __obj.asInstanceOf[_UnmarshalledServerSideEncryptionConfiguration]
  }
}

