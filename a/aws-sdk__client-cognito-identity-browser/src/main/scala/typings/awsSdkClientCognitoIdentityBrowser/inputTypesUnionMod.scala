package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
    - typings.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def CreateIdentityPoolInput(AllowUnauthenticatedIdentities: Boolean, IdentityPoolName: String): typings.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput = {
      val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput]
    }
    
    @scala.inline
    def DeleteIdentitiesInput(IdentityIdsToDelete: js.Array[String] | Iterable[String]): typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput = {
      val __obj = js.Dynamic.literal(IdentityIdsToDelete = IdentityIdsToDelete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput]
    }
    
    @scala.inline
    def DeleteIdentityPoolInput(IdentityPoolId: String): typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput]
    }
    
    @scala.inline
    def DescribeIdentityInput(IdentityId: String): typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput]
    }
    
    @scala.inline
    def DescribeIdentityPoolInput(IdentityPoolId: String): typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput]
    }
    
    @scala.inline
    def GetCredentialsForIdentityInput(IdentityId: String): typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput]
    }
    
    @scala.inline
    def GetIdInput(IdentityPoolId: String): typings.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput]
    }
    
    @scala.inline
    def GetIdentityPoolRolesInput(IdentityPoolId: String): typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput]
    }
    
    @scala.inline
    def GetOpenIdTokenForDeveloperIdentityInput(IdentityPoolId: String, Logins: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Logins = Logins.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput]
    }
    
    @scala.inline
    def GetOpenIdTokenInput(IdentityId: String): typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput = {
      val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput]
    }
    
    @scala.inline
    def ListIdentitiesInput(IdentityPoolId: String, MaxResults: Double): typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], MaxResults = MaxResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput]
    }
    
    @scala.inline
    def ListIdentityPoolsInput(MaxResults: Double): typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput = {
      val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput]
    }
    
    @scala.inline
    def LookupDeveloperIdentityInput(IdentityPoolId: String): typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput]
    }
    
    @scala.inline
    def MergeDeveloperIdentitiesInput(
      DestinationUserIdentifier: String,
      DeveloperProviderName: String,
      IdentityPoolId: String,
      SourceUserIdentifier: String
    ): typings.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput = {
      val __obj = js.Dynamic.literal(DestinationUserIdentifier = DestinationUserIdentifier.asInstanceOf[js.Any], DeveloperProviderName = DeveloperProviderName.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], SourceUserIdentifier = SourceUserIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput]
    }
    
    @scala.inline
    def SetIdentityPoolRolesInput(IdentityPoolId: String, Roles: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput]
    }
    
    @scala.inline
    def UnlinkDeveloperIdentityInput(
      DeveloperProviderName: String,
      DeveloperUserIdentifier: String,
      IdentityId: String,
      IdentityPoolId: String
    ): typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput = {
      val __obj = js.Dynamic.literal(DeveloperProviderName = DeveloperProviderName.asInstanceOf[js.Any], DeveloperUserIdentifier = DeveloperUserIdentifier.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput]
    }
    
    @scala.inline
    def UnlinkIdentityInput(
      IdentityId: String,
      Logins: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]),
      LoginsToRemove: js.Array[String] | Iterable[String]
    ): typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput = {
      val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any], Logins = Logins.asInstanceOf[js.Any], LoginsToRemove = LoginsToRemove.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput]
    }
    
    @scala.inline
    def UpdateIdentityPoolInput(AllowUnauthenticatedIdentities: Boolean, IdentityPoolId: String, IdentityPoolName: String): typings.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput = {
      val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput]
    }
  }
}
