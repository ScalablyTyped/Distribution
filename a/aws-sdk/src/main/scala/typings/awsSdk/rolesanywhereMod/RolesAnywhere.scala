package typings.awsSdk.rolesanywhereMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolesAnywhere extends Service {
  
  @JSName("config")
  var config_RolesAnywhere: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a profile. A profile is configuration resource to list the roles that RolesAnywhere service is trusted to assume. In addition, by applying a profile you can intersect permissions with IAM managed policies.  Required permissions:  rolesanywhere:CreateProfile. 
    */
  def createProfile(): Request[ProfileDetailResponse, AWSError] = js.native
  def createProfile(callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]): Request[ProfileDetailResponse, AWSError] = js.native
  /**
    * Creates a profile. A profile is configuration resource to list the roles that RolesAnywhere service is trusted to assume. In addition, by applying a profile you can intersect permissions with IAM managed policies.  Required permissions:  rolesanywhere:CreateProfile. 
    */
  def createProfile(params: CreateProfileRequest): Request[ProfileDetailResponse, AWSError] = js.native
  def createProfile(
    params: CreateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]
  ): Request[ProfileDetailResponse, AWSError] = js.native
  
  /**
    * Creates a trust anchor. You establish trust between IAM Roles Anywhere and your certificate authority (CA) by configuring a trust anchor. A Trust Anchor is defined either as a reference to a AWS Certificate Manager Private Certificate Authority (ACM PCA), or by uploading a Certificate Authority (CA) certificate. Your AWS workloads can authenticate with the trust anchor using certificates issued by the trusted Certificate Authority (CA) in exchange for temporary AWS credentials.  Required permissions:  rolesanywhere:CreateTrustAnchor. 
    */
  def createTrustAnchor(): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def createTrustAnchor(callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]): Request[TrustAnchorDetailResponse, AWSError] = js.native
  /**
    * Creates a trust anchor. You establish trust between IAM Roles Anywhere and your certificate authority (CA) by configuring a trust anchor. A Trust Anchor is defined either as a reference to a AWS Certificate Manager Private Certificate Authority (ACM PCA), or by uploading a Certificate Authority (CA) certificate. Your AWS workloads can authenticate with the trust anchor using certificates issued by the trusted Certificate Authority (CA) in exchange for temporary AWS credentials.  Required permissions:  rolesanywhere:CreateTrustAnchor. 
    */
  def createTrustAnchor(params: CreateTrustAnchorRequest): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def createTrustAnchor(
    params: CreateTrustAnchorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]
  ): Request[TrustAnchorDetailResponse, AWSError] = js.native
  
  /**
    * Deletes a certificate revocation list (CRL).  Required permissions:  rolesanywhere:DeleteCrl. 
    */
  def deleteCrl(): Request[CrlDetailResponse, AWSError] = js.native
  def deleteCrl(callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]): Request[CrlDetailResponse, AWSError] = js.native
  /**
    * Deletes a certificate revocation list (CRL).  Required permissions:  rolesanywhere:DeleteCrl. 
    */
  def deleteCrl(params: ScalarCrlRequest): Request[CrlDetailResponse, AWSError] = js.native
  def deleteCrl(
    params: ScalarCrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]
  ): Request[CrlDetailResponse, AWSError] = js.native
  
  /**
    * Deletes a profile.  Required permissions:  rolesanywhere:DeleteProfile. 
    */
  def deleteProfile(): Request[ProfileDetailResponse, AWSError] = js.native
  def deleteProfile(callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]): Request[ProfileDetailResponse, AWSError] = js.native
  /**
    * Deletes a profile.  Required permissions:  rolesanywhere:DeleteProfile. 
    */
  def deleteProfile(params: ScalarProfileRequest): Request[ProfileDetailResponse, AWSError] = js.native
  def deleteProfile(
    params: ScalarProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]
  ): Request[ProfileDetailResponse, AWSError] = js.native
  
  /**
    * Deletes a trust anchor.  Required permissions:  rolesanywhere:DeleteTrustAnchor. 
    */
  def deleteTrustAnchor(): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def deleteTrustAnchor(callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]): Request[TrustAnchorDetailResponse, AWSError] = js.native
  /**
    * Deletes a trust anchor.  Required permissions:  rolesanywhere:DeleteTrustAnchor. 
    */
  def deleteTrustAnchor(params: ScalarTrustAnchorRequest): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def deleteTrustAnchor(
    params: ScalarTrustAnchorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]
  ): Request[TrustAnchorDetailResponse, AWSError] = js.native
  
  /**
    * Disables a certificate revocation list (CRL).  Required permissions:  rolesanywhere:DisableCrl. 
    */
  def disableCrl(): Request[CrlDetailResponse, AWSError] = js.native
  def disableCrl(callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]): Request[CrlDetailResponse, AWSError] = js.native
  /**
    * Disables a certificate revocation list (CRL).  Required permissions:  rolesanywhere:DisableCrl. 
    */
  def disableCrl(params: ScalarCrlRequest): Request[CrlDetailResponse, AWSError] = js.native
  def disableCrl(
    params: ScalarCrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]
  ): Request[CrlDetailResponse, AWSError] = js.native
  
  /**
    * Disables a profile. When disabled, CreateSession requests with this profile fail.  Required permissions:  rolesanywhere:DisableProfile. 
    */
  def disableProfile(): Request[ProfileDetailResponse, AWSError] = js.native
  def disableProfile(callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]): Request[ProfileDetailResponse, AWSError] = js.native
  /**
    * Disables a profile. When disabled, CreateSession requests with this profile fail.  Required permissions:  rolesanywhere:DisableProfile. 
    */
  def disableProfile(params: ScalarProfileRequest): Request[ProfileDetailResponse, AWSError] = js.native
  def disableProfile(
    params: ScalarProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]
  ): Request[ProfileDetailResponse, AWSError] = js.native
  
  /**
    * Disables a trust anchor. When disabled, CreateSession requests specifying this trust anchor are unauthorized.  Required permissions:  rolesanywhere:DisableTrustAnchor. 
    */
  def disableTrustAnchor(): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def disableTrustAnchor(callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]): Request[TrustAnchorDetailResponse, AWSError] = js.native
  /**
    * Disables a trust anchor. When disabled, CreateSession requests specifying this trust anchor are unauthorized.  Required permissions:  rolesanywhere:DisableTrustAnchor. 
    */
  def disableTrustAnchor(params: ScalarTrustAnchorRequest): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def disableTrustAnchor(
    params: ScalarTrustAnchorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]
  ): Request[TrustAnchorDetailResponse, AWSError] = js.native
  
  /**
    * Enables a certificate revocation list (CRL). When enabled, certificates stored in the CRL are unauthorized to receive session credentials.  Required permissions:  rolesanywhere:EnableCrl. 
    */
  def enableCrl(): Request[CrlDetailResponse, AWSError] = js.native
  def enableCrl(callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]): Request[CrlDetailResponse, AWSError] = js.native
  /**
    * Enables a certificate revocation list (CRL). When enabled, certificates stored in the CRL are unauthorized to receive session credentials.  Required permissions:  rolesanywhere:EnableCrl. 
    */
  def enableCrl(params: ScalarCrlRequest): Request[CrlDetailResponse, AWSError] = js.native
  def enableCrl(
    params: ScalarCrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]
  ): Request[CrlDetailResponse, AWSError] = js.native
  
  /**
    * Enables the roles in a profile to receive session credentials in CreateSession.   Required permissions:  rolesanywhere:EnableProfile. 
    */
  def enableProfile(): Request[ProfileDetailResponse, AWSError] = js.native
  def enableProfile(callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]): Request[ProfileDetailResponse, AWSError] = js.native
  /**
    * Enables the roles in a profile to receive session credentials in CreateSession.   Required permissions:  rolesanywhere:EnableProfile. 
    */
  def enableProfile(params: ScalarProfileRequest): Request[ProfileDetailResponse, AWSError] = js.native
  def enableProfile(
    params: ScalarProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]
  ): Request[ProfileDetailResponse, AWSError] = js.native
  
  /**
    * Enables a trust anchor. When enabled, certificates in the trust anchor chain are authorized for trust validation.   Required permissions:  rolesanywhere:EnableTrustAnchor. 
    */
  def enableTrustAnchor(): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def enableTrustAnchor(callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]): Request[TrustAnchorDetailResponse, AWSError] = js.native
  /**
    * Enables a trust anchor. When enabled, certificates in the trust anchor chain are authorized for trust validation.   Required permissions:  rolesanywhere:EnableTrustAnchor. 
    */
  def enableTrustAnchor(params: ScalarTrustAnchorRequest): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def enableTrustAnchor(
    params: ScalarTrustAnchorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]
  ): Request[TrustAnchorDetailResponse, AWSError] = js.native
  
  /**
    * Gets a certificate revocation list (CRL).  Required permissions:  rolesanywhere:GetCrl. 
    */
  def getCrl(): Request[CrlDetailResponse, AWSError] = js.native
  def getCrl(callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]): Request[CrlDetailResponse, AWSError] = js.native
  /**
    * Gets a certificate revocation list (CRL).  Required permissions:  rolesanywhere:GetCrl. 
    */
  def getCrl(params: ScalarCrlRequest): Request[CrlDetailResponse, AWSError] = js.native
  def getCrl(
    params: ScalarCrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]
  ): Request[CrlDetailResponse, AWSError] = js.native
  
  /**
    * Gets a profile.  Required permissions:  rolesanywhere:GetProfile. 
    */
  def getProfile(): Request[ProfileDetailResponse, AWSError] = js.native
  def getProfile(callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]): Request[ProfileDetailResponse, AWSError] = js.native
  /**
    * Gets a profile.  Required permissions:  rolesanywhere:GetProfile. 
    */
  def getProfile(params: ScalarProfileRequest): Request[ProfileDetailResponse, AWSError] = js.native
  def getProfile(
    params: ScalarProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]
  ): Request[ProfileDetailResponse, AWSError] = js.native
  
  /**
    * Gets a Subject. A Subject associates a certificate identity with authentication attempts by CreateSession. The Subject resources stores audit information such as status of the last authentication attempt, the certificate data used in the attempt, and the last time the associated identity attempted authentication.   Required permissions:  rolesanywhere:GetSubject. 
    */
  def getSubject(): Request[SubjectDetailResponse, AWSError] = js.native
  def getSubject(callback: js.Function2[/* err */ AWSError, /* data */ SubjectDetailResponse, Unit]): Request[SubjectDetailResponse, AWSError] = js.native
  /**
    * Gets a Subject. A Subject associates a certificate identity with authentication attempts by CreateSession. The Subject resources stores audit information such as status of the last authentication attempt, the certificate data used in the attempt, and the last time the associated identity attempted authentication.   Required permissions:  rolesanywhere:GetSubject. 
    */
  def getSubject(params: ScalarSubjectRequest): Request[SubjectDetailResponse, AWSError] = js.native
  def getSubject(
    params: ScalarSubjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SubjectDetailResponse, Unit]
  ): Request[SubjectDetailResponse, AWSError] = js.native
  
  /**
    * Gets a trust anchor.  Required permissions:  rolesanywhere:GetTrustAnchor. 
    */
  def getTrustAnchor(): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def getTrustAnchor(callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]): Request[TrustAnchorDetailResponse, AWSError] = js.native
  /**
    * Gets a trust anchor.  Required permissions:  rolesanywhere:GetTrustAnchor. 
    */
  def getTrustAnchor(params: ScalarTrustAnchorRequest): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def getTrustAnchor(
    params: ScalarTrustAnchorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]
  ): Request[TrustAnchorDetailResponse, AWSError] = js.native
  
  /**
    * Imports the certificate revocation list (CRL). CRl is a list of certificates that have been revoked by the issuing certificate Authority (CA). IAM Roles Anywhere validates against the crl list before issuing credentials.   Required permissions:  rolesanywhere:ImportCrl. 
    */
  def importCrl(): Request[CrlDetailResponse, AWSError] = js.native
  def importCrl(callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]): Request[CrlDetailResponse, AWSError] = js.native
  /**
    * Imports the certificate revocation list (CRL). CRl is a list of certificates that have been revoked by the issuing certificate Authority (CA). IAM Roles Anywhere validates against the crl list before issuing credentials.   Required permissions:  rolesanywhere:ImportCrl. 
    */
  def importCrl(params: ImportCrlRequest): Request[CrlDetailResponse, AWSError] = js.native
  def importCrl(
    params: ImportCrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]
  ): Request[CrlDetailResponse, AWSError] = js.native
  
  /**
    * Lists all Crls in the authenticated account and Amazon Web Services Region.  Required permissions:  rolesanywhere:ListCrls. 
    */
  def listCrls(): Request[ListCrlsResponse, AWSError] = js.native
  def listCrls(callback: js.Function2[/* err */ AWSError, /* data */ ListCrlsResponse, Unit]): Request[ListCrlsResponse, AWSError] = js.native
  /**
    * Lists all Crls in the authenticated account and Amazon Web Services Region.  Required permissions:  rolesanywhere:ListCrls. 
    */
  def listCrls(params: ListRequest): Request[ListCrlsResponse, AWSError] = js.native
  def listCrls(params: ListRequest, callback: js.Function2[/* err */ AWSError, /* data */ ListCrlsResponse, Unit]): Request[ListCrlsResponse, AWSError] = js.native
  
  /**
    * Lists all profiles in the authenticated account and Amazon Web Services Region.  Required permissions:  rolesanywhere:ListProfiles. 
    */
  def listProfiles(): Request[ListProfilesResponse, AWSError] = js.native
  def listProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListProfilesResponse, Unit]): Request[ListProfilesResponse, AWSError] = js.native
  /**
    * Lists all profiles in the authenticated account and Amazon Web Services Region.  Required permissions:  rolesanywhere:ListProfiles. 
    */
  def listProfiles(params: ListRequest): Request[ListProfilesResponse, AWSError] = js.native
  def listProfiles(
    params: ListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProfilesResponse, Unit]
  ): Request[ListProfilesResponse, AWSError] = js.native
  
  /**
    * Lists the subjects in the authenticated account and Amazon Web Services Region.  Required permissions:  rolesanywhere:ListSubjects. 
    */
  def listSubjects(): Request[ListSubjectsResponse, AWSError] = js.native
  def listSubjects(callback: js.Function2[/* err */ AWSError, /* data */ ListSubjectsResponse, Unit]): Request[ListSubjectsResponse, AWSError] = js.native
  /**
    * Lists the subjects in the authenticated account and Amazon Web Services Region.  Required permissions:  rolesanywhere:ListSubjects. 
    */
  def listSubjects(params: ListRequest): Request[ListSubjectsResponse, AWSError] = js.native
  def listSubjects(
    params: ListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubjectsResponse, Unit]
  ): Request[ListSubjectsResponse, AWSError] = js.native
  
  /**
    * Lists the tags attached to the resource.  Required permissions:  rolesanywhere:ListTagsForResource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags attached to the resource.  Required permissions:  rolesanywhere:ListTagsForResource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the trust anchors in the authenticated account and Amazon Web Services Region.  Required permissions:  rolesanywhere:ListTrustAnchors. 
    */
  def listTrustAnchors(): Request[ListTrustAnchorsResponse, AWSError] = js.native
  def listTrustAnchors(callback: js.Function2[/* err */ AWSError, /* data */ ListTrustAnchorsResponse, Unit]): Request[ListTrustAnchorsResponse, AWSError] = js.native
  /**
    * Lists the trust anchors in the authenticated account and Amazon Web Services Region.  Required permissions:  rolesanywhere:ListTrustAnchors. 
    */
  def listTrustAnchors(params: ListRequest): Request[ListTrustAnchorsResponse, AWSError] = js.native
  def listTrustAnchors(
    params: ListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrustAnchorsResponse, Unit]
  ): Request[ListTrustAnchorsResponse, AWSError] = js.native
  
  /**
    * Attaches tags to a resource.  Required permissions:  rolesanywhere:TagResource. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Attaches tags to a resource.  Required permissions:  rolesanywhere:TagResource. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from the resource.  Required permissions:  rolesanywhere:UntagResource. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from the resource.  Required permissions:  rolesanywhere:UntagResource. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the certificate revocation list (CRL). CRl is a list of certificates that have been revoked by the issuing certificate Authority (CA). IAM Roles Anywhere validates against the crl list before issuing credentials.  Required permissions:  rolesanywhere:UpdateCrl. 
    */
  def updateCrl(): Request[CrlDetailResponse, AWSError] = js.native
  def updateCrl(callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]): Request[CrlDetailResponse, AWSError] = js.native
  /**
    * Updates the certificate revocation list (CRL). CRl is a list of certificates that have been revoked by the issuing certificate Authority (CA). IAM Roles Anywhere validates against the crl list before issuing credentials.  Required permissions:  rolesanywhere:UpdateCrl. 
    */
  def updateCrl(params: UpdateCrlRequest): Request[CrlDetailResponse, AWSError] = js.native
  def updateCrl(
    params: UpdateCrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CrlDetailResponse, Unit]
  ): Request[CrlDetailResponse, AWSError] = js.native
  
  /**
    * Updates the profile. A profile is configuration resource to list the roles that RolesAnywhere service is trusted to assume. In addition, by applying a profile you can scope-down permissions with IAM managed policies.  Required permissions:  rolesanywhere:UpdateProfile. 
    */
  def updateProfile(): Request[ProfileDetailResponse, AWSError] = js.native
  def updateProfile(callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]): Request[ProfileDetailResponse, AWSError] = js.native
  /**
    * Updates the profile. A profile is configuration resource to list the roles that RolesAnywhere service is trusted to assume. In addition, by applying a profile you can scope-down permissions with IAM managed policies.  Required permissions:  rolesanywhere:UpdateProfile. 
    */
  def updateProfile(params: UpdateProfileRequest): Request[ProfileDetailResponse, AWSError] = js.native
  def updateProfile(
    params: UpdateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProfileDetailResponse, Unit]
  ): Request[ProfileDetailResponse, AWSError] = js.native
  
  /**
    * Updates the trust anchor.You establish trust between IAM Roles Anywhere and your certificate authority (CA) by configuring a trust anchor. A Trust Anchor is defined either as a reference to a AWS Certificate Manager Private Certificate Authority (ACM PCA), or by uploading a Certificate Authority (CA) certificate. Your AWS workloads can authenticate with the trust anchor using certificates issued by the trusted Certificate Authority (CA) in exchange for temporary AWS credentials.  Required permissions:  rolesanywhere:UpdateTrustAnchor. 
    */
  def updateTrustAnchor(): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def updateTrustAnchor(callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]): Request[TrustAnchorDetailResponse, AWSError] = js.native
  /**
    * Updates the trust anchor.You establish trust between IAM Roles Anywhere and your certificate authority (CA) by configuring a trust anchor. A Trust Anchor is defined either as a reference to a AWS Certificate Manager Private Certificate Authority (ACM PCA), or by uploading a Certificate Authority (CA) certificate. Your AWS workloads can authenticate with the trust anchor using certificates issued by the trusted Certificate Authority (CA) in exchange for temporary AWS credentials.  Required permissions:  rolesanywhere:UpdateTrustAnchor. 
    */
  def updateTrustAnchor(params: UpdateTrustAnchorRequest): Request[TrustAnchorDetailResponse, AWSError] = js.native
  def updateTrustAnchor(
    params: UpdateTrustAnchorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TrustAnchorDetailResponse, Unit]
  ): Request[TrustAnchorDetailResponse, AWSError] = js.native
}
